/*
 * Copyright 2024 VEuPathDB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.veupathdb.lib.cli.diamond.commands

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonSetter
import io.foxcapades.lib.cli.wrapper.meta.CliCommand
import io.foxcapades.lib.cli.wrapper.meta.CliFlag
import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOutputOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer

@CliCommand(Command, SubCommands.GetSeq)
interface GetSeq
  : DiamondCommandConfig
  , GeneralOptionContainer
  , GeneralDBOptionContainer
  , GeneralOutputOptionContainer
  , HiddenOptionContainer
{
  /**
   * Space-separated list of sequence numbers to display.
   *
   * Flag: `--seq`
   */
  @CliFlag("seq")
  @get:JsonGetter("seq")
  @set:JsonSetter("seq")
  var seq: List<Int>
}
