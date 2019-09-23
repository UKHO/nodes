package io.aexp.nodes.graphql;

final class OrderedPropertyHolder implements Comparable<OrderedPropertyHolder> {
    private String name;
    private Property property;
    private long order;

    public OrderedPropertyHolder(String name, Property property, long order) {
        this.name = name;
        this.property = property;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public Property getProperty() {
        return property;
    }

    public int compareTo(OrderedPropertyHolder o) {
        long diff = order - o.order;
        if (diff > 0) {
            return 1;
        }
        else if (diff < 0) {
            return -1;
        }
        return name.compareTo(o.name);
    }
}

