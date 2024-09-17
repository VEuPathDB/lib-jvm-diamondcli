package org.veupathdb.lib.cli.diamond.commands

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import org.veupathdb.lib.cli.diamond.DiamondCommand
import org.veupathdb.lib.cli.diamond.DiamondExtras

@OptIn(DiamondExtras::class)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "tool")
@JsonSubTypes(
  JsonSubTypes.Type(value = BlastN::class, name = SubCommands.BlastN),
  JsonSubTypes.Type(value = BlastP::class, name = SubCommands.BlastP),
  JsonSubTypes.Type(value = BlastX::class, name = SubCommands.BlastX),
  JsonSubTypes.Type(value = Cluster::class, name = SubCommands.Cluster),
  JsonSubTypes.Type(value = ClusterRealign::class, name = SubCommands.ClusterRealign),
  JsonSubTypes.Type(value = DBInfo::class, name = SubCommands.DBInfo),
  JsonSubTypes.Type(value = DeepClustering::class, name = SubCommands.DeepClustering),
  JsonSubTypes.Type(value = GetSeq::class, name = SubCommands.GetSeq),
  JsonSubTypes.Type(value = GreedyVortexCover::class, name = SubCommands.GreedyVortexCover),
  JsonSubTypes.Type(value = LinearCluster::class, name = SubCommands.LinearCluster),
  JsonSubTypes.Type(value = MakeDB::class, name = SubCommands.MakeDB),
  JsonSubTypes.Type(value = MakeIndex::class, name = SubCommands.MakeIndex),
  JsonSubTypes.Type(value = MergeDAA::class, name = SubCommands.MergeDAA),
  JsonSubTypes.Type(value = PrepDB::class, name = SubCommands.PrepDB),
  JsonSubTypes.Type(value = ReassignClusters::class, name = SubCommands.ReassignClusters),
  JsonSubTypes.Type(value = RecomputeClustering::class, name = SubCommands.RecomputeClustering),
  JsonSubTypes.Type(value = View::class, name = SubCommands.View),
)
sealed interface DiamondCommandConfig {
  /**
   * Diamond subcommand.
   */
  @get:JsonGetter("tool")
  val tool: DiamondCommand
}
