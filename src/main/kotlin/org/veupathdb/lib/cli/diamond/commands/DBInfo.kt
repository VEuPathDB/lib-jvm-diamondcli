package org.veupathdb.lib.cli.diamond.commands

import org.veupathdb.lib.cli.diamond.opts.GeneralDBOptionContainer
import org.veupathdb.lib.cli.diamond.opts.GeneralOptionContainer
import org.veupathdb.lib.cli.diamond.opts.HiddenOptionContainer

interface DBInfo : GeneralOptionContainer, GeneralDBOptionContainer, HiddenOptionContainer
