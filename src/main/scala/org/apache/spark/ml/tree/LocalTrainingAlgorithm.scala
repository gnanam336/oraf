/*
 * Copyright (C) 2019 Cisco Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.ml.tree

import org.apache.spark.ml.tree.impl.{DecisionTreeMetadata, TreePoint}

trait LocalTrainingAlgorithm extends Serializable {

  def fitNode(input: Array[TreePoint],
              instanceWeights: Array[Double],
              node: OptimizedLearningNode,
              metadata: DecisionTreeMetadata,
              splits: Array[Array[Split]],
              maxDepthOverride: Option[Int] = None,
              prune: Boolean = true): OptimizedNode
}
