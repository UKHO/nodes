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

package io.aexp.nodes.graphql.models;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLArguments;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

public class TestMixedOrderedModel {
    @GraphQLProperty(name = "test", order = -1)
    @GraphQLArguments({
            @GraphQLArgument(name = "number", value = "ONE"),
    })
    private TestModelEnum test1;
    @GraphQLProperty(name = "testing")
    @GraphQLArguments({
            @GraphQLArgument(name = "number", value = "TWO"),
    })
    private TestModelEnum test2;

    @GraphQLProperty(name = "moreTesting", order = 1)
    @GraphQLArguments({
            @GraphQLArgument(name = "number", value = "THREE"),
    })
    private TestModelEnum test3;

    public TestModelEnum getTest1() {
        return test1;
    }

    public void setTest1(TestModelEnum test1) {
        this.test1 = test1;
    }

    public TestModelEnum getTest2() {
        return test2;
    }

    public void setTest2(TestModelEnum test2) {
        this.test2 = test2;
    }

    public TestModelEnum getTest3() {
        return test3;
    }

    public void setTest3(TestModelEnum test3) {
        this.test3 = test3;
    }

    @Override
    public String toString() {
        return "TestMixedOrderedModel{" +
                "test1=" + test1 +
                ", test2=" + test2 +
                ", test3=" + test3 +
                '}';
    }
}
