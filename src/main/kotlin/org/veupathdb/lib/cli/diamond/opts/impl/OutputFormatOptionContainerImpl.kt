package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.builder.flag.flag
import io.foxcapades.lib.cli.builder.flag.toggleFlag
import io.foxcapades.lib.cli.builder.arg.format.ArgumentFormatter
import org.veupathdb.lib.cli.diamond.opts.OutputFormatOptionContainer
import org.veupathdb.lib.cli.diamond.opts.output_format.OutputFormatOptions

internal class OutputFormatOptionContainerImpl : OutputFormatOptionContainer {
  override var outputFormat by flag<OutputFormatOptions> { formatter = ArgumentFormatter(OutputFormatOptions::toString) }
  override var includeLineage by toggleFlag()
}
