// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: redacted_test.proto
package com.squareup.wire.protos.kotlin.redacted

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.TagHandler
import com.squareup.wire.WireField
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmField
import okio.ByteString

data class RedactedExtension(
  @field:WireField(tag = 1, adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true)
      val d: String? = null,
  @field:WireField(tag = 2, adapter = "com.squareup.wire.ProtoAdapter#STRING") val e: String? =
      null,
  val unknownFields: ByteString = ByteString.EMPTY
) : Message<RedactedExtension, RedactedExtension.Builder>(ADAPTER, unknownFields) {
  @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Builder = Builder(this.copy())

  override fun toString(): String = buildString {
    append("RedactedExtension(")
    append("""d=██""")
    append(""", e=$e""")
    append(")")
  }

  class Builder(private val message: RedactedExtension) : Message.Builder<RedactedExtension,
      Builder>() {
    override fun build(): RedactedExtension = message
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<RedactedExtension> = object : ProtoAdapter<RedactedExtension>(
      FieldEncoding.LENGTH_DELIMITED, 
      RedactedExtension::class.java
    ) {
      override fun encodedSize(value: RedactedExtension): Int = 
        ProtoAdapter.STRING.encodedSizeWithTag(1, value.d) +
        ProtoAdapter.STRING.encodedSizeWithTag(2, value.e) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: RedactedExtension) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.d)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.e)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): RedactedExtension {
        var d: String? = null
        var e: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> d = ProtoAdapter.STRING.decode(reader)
            2 -> e = ProtoAdapter.STRING.decode(reader)
            else -> TagHandler.UNKNOWN_TAG
          }
        }
        return RedactedExtension(
          d = d,
          e = e,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: RedactedExtension): RedactedExtension = value.copy(
        d = null,
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
