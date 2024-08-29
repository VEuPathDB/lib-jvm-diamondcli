package org.veupathdb.lib.cli.diamond.opts

interface AdvancedGeneralOptionContainer {
  ("file-buffer-size", 0, "file buffer size in bytes (default=67108864)", file_buffer_size, (size_t)67108864)
  ("no-unlink", 0, "Do not unlink temporary files.", no_unlink)
  ("ignore-warnings", 0, "Ignore warnings", ignore_warnings)
  ("no-parse-seqids", 0, "Print raw seqids without parsing", no_parse_seqids);
}