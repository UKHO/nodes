/*
 * Copyright (c) 2018 American Express Travel Related Services Company, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.aexp.nodes.graphql;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import io.aexp.nodes.graphql.GraphQLTemplate.GraphQLMethod;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class OrderedPropertyHolderTest {

    @Test
    public void orderedPropertyHolderTest() {
        Property testProperty = new Property();
        OrderedPropertyHolder orderedPropertyHolder = new OrderedPropertyHolder("test", testProperty, 1);
        assertEquals(testProperty, orderedPropertyHolder.getProperty());
        assertEquals("test", orderedPropertyHolder.getName());
    }

    @Test
    public void orderedPropertyOrderingTest() {
        Property testProperty = new Property();
        OrderedPropertyHolder one = new OrderedPropertyHolder("1", testProperty, 1);
        OrderedPropertyHolder two = new OrderedPropertyHolder("2", testProperty, 2);
        OrderedPropertyHolder three = new OrderedPropertyHolder("3", testProperty, 2);
        assertThat(one.compareTo(two), CoreMatchers.is(-1));
        assertThat(two.compareTo(one), CoreMatchers.is(1));
        assertThat(one.compareTo(one), CoreMatchers.is(0));
        assertThat(two.compareTo(three), CoreMatchers.is(-1));
    }

}
