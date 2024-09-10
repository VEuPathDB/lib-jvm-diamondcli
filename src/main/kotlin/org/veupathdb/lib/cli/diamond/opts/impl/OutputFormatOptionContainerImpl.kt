package org.veupathdb.lib.cli.diamond.opts.impl

import io.foxcapades.lib.cli.wrapper.flag
import io.foxcapades.lib.cli.wrapper.flag.toggleFlag
import io.foxcapades.lib.cli.wrapper.serial.values.ArgumentFormatter
import org.veupathdb.lib.cli.diamond.opts.OutputFormatOptionContainer
import org.veupathdb.lib.cli.diamond.opts.output_format.OutputFormatOptions

internal class OutputFormatOptionContainerImpl : OutputFormatOptionContainer {
  override var outputFormat by flag<OutputFormatOptions> { argument.formatter = ArgumentFormatter.ofToString() }
  override var includeLineage by toggleFlag()
}
