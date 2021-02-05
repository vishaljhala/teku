/*
 * Copyright 2020 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package tech.pegasys.teku.ssz.backing.containers;

import tech.pegasys.teku.ssz.backing.SszData;
import tech.pegasys.teku.ssz.backing.tree.TreeNode;
import tech.pegasys.teku.ssz.backing.view.AbstractSszImmutableContainer;

/** Autogenerated by tech.pegasys.teku.ssz.backing.ContainersGenerator */
public class Container3<
        C extends Container3<C, V0, V1, V2>,
        V0 extends SszData,
        V1 extends SszData,
        V2 extends SszData>
    extends AbstractSszImmutableContainer {

  protected Container3(ContainerSchema3<C, V0, V1, V2> schema) {
    super(schema);
  }

  protected Container3(ContainerSchema3<C, V0, V1, V2> schema, TreeNode backingNode) {
    super(schema, backingNode);
  }

  protected Container3(ContainerSchema3<C, V0, V1, V2> schema, V0 arg0, V1 arg1, V2 arg2) {
    super(schema, arg0, arg1, arg2);
  }

  protected V0 getField0() {
    return getAny(0);
  }

  protected V1 getField1() {
    return getAny(1);
  }

  protected V2 getField2() {
    return getAny(2);
  }
}
