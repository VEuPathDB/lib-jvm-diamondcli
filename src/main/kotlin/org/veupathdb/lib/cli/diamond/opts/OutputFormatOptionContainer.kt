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

package org.veupathdb.lib.cli.diamond.opts

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonSetter

interface OutputFormatOptionContainer {
  //
  // `--outfmt` | `-f`
  // Default = ``
  // Type = `string_vector`
  // Config Var = `output_format`
  @get:JsonGetter("outputFormat")
  @set:JsonSetter("outputFormat")
  var outputFormat: Any // TODO: complex type

  // Include lineage in the taxonomic classification format
  // `--include-lineage`
  // Default = ``
  // Type = `bool`
  // Config Var = `include_lineage`
  @get:JsonGetter("includeLineage")
  @set:JsonSetter("includeLineage")
  var includeLineage: Boolean
}


// Valid formats appear to be:
//
// "null"        -> null format
// "bin1"        -> bin1 format
// "clus"        -> clustering format
// "edge"        -> Output::Format::Edge
// "0"           -> pairwise format
// "5"   | "xml" -> xml format
// "6"   | "tab" -> blast tab format
// "100" | "daa" -> diamond alignment archive format
// "101" | "sam" -> sam format
// "102"         -> taxon format
// "103" | "paf" -> paf format
// "104" | "json-flat" -> json blast tab

interface OutputFormatOptions {
  val formatType: OutputFormat
}

enum class OutputFormat(val intForm: Int, val stringForm: String) {
  Pairwise(0),
  XML(5, "xml"),
  BlastTab(6, "tab"),
  DiamondAlignmentArchive(100, "daa"),
  SAM(101, "sam"),
  Taxon(102),
  PAF(103, "paf"),
  JsonFlat(104, "json-flat"),
  Null("null"),
  Bin1("bin1"),
  Clustering("clus"),
  Edge("edge")
  ;

  constructor(intForm: Int) : this(intForm, "")

  constructor(stringForm: String) : this(-1, stringForm)

  inline val hasIntForm get() = intForm >= 0

  inline val hasStringForm get() = stringForm.isNotEmpty()

  inline val acceptsFormatParams get() = this == BlastTab || this == JsonFlat

  override fun toString() = toString(false)

  fun toString(preferStringForm: Boolean) =
    if (preferStringForm && hasStringForm || !hasIntForm)
      stringForm
    else
      intForm.toString()
}

@JvmInline
value class SimpleOutputFormat private constructor(val value: Int) : OutputFormatOptions {
  companion object {
    @JvmStatic
    val Pairwise by lazy { SimpleOutputFormat(0) }

    @JvmStatic
    val XML by lazy { SimpleOutputFormat(5) }

    // DiamondAlignmentArchiveFormat
    @JvmStatic
    val DAA by lazy { SimpleOutputFormat(100) }

    @JvmStatic
    val SAM by lazy { SimpleOutputFormat(101) }

    @JvmStatic
    val TaxonomicClassification by lazy { SimpleOutputFormat(102) }
  }
}

data class PAF
