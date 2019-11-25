// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: simple_message.proto
package com.squareup.wire.protos.kotlin.simple

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.internal.checkElementsNotNull
import com.squareup.wire.internal.missingRequiredFields
import com.squareup.wire.protos.kotlin.foreign.ForeignEnum
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

/**
 * A message for testing.
 */
class SimpleMessage(
  /**
   * An optional int32
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  @JvmField
  val optional_int32: Int? = null,
  /**
   * An optional NestedMessage, deprecated
   */
  @Deprecated(message = "optional_nested_msg is deprecated")
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.protos.kotlin.simple.SimpleMessage${'$'}NestedMessage#ADAPTER"
  )
  @JvmField
  val optional_nested_msg: NestedMessage? = null,
  /**
   * An optional ExternalMessage
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.protos.kotlin.simple.ExternalMessage#ADAPTER"
  )
  @JvmField
  val optional_external_msg: ExternalMessage? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.protos.kotlin.simple.SimpleMessage${'$'}NestedEnum#ADAPTER"
  )
  @JvmField
  val default_nested_enum: NestedEnum? = null,
  /**
   * A required int32
   */
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.REQUIRED
  )
  @JvmField
  val required_int32: Int,
  /**
   * A repeated double, deprecated
   */
  @Deprecated(message = "repeated_double is deprecated")
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#DOUBLE",
    label = WireField.Label.REPEATED
  )
  @JvmField
  val repeated_double: List<Double> = emptyList(),
  /**
   * enum from another package with an explicit default
   */
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.protos.kotlin.foreign.ForeignEnum#ADAPTER"
  )
  @JvmField
  val default_foreign_enum: ForeignEnum? = null,
  /**
   * enum from another package without an explicit default
   */
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.protos.kotlin.foreign.ForeignEnum#ADAPTER"
  )
  @JvmField
  val no_default_foreign_enum: ForeignEnum? = null,
  /**
   * field with the same name as a Java keyword
   */
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val package_: String? = null,
  /**
   * field with the name "result"
   */
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val result: String? = null,
  /**
   * field with the name "other"
   */
  @field:WireField(
    tag = 11,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val other: String? = null,
  /**
   * field with the name "o"
   */
  @field:WireField(
    tag = 12,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val o: String? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<SimpleMessage, SimpleMessage.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.optional_int32 = optional_int32
    builder.optional_nested_msg = optional_nested_msg
    builder.optional_external_msg = optional_external_msg
    builder.default_nested_enum = default_nested_enum
    builder.required_int32 = required_int32
    builder.repeated_double = repeated_double
    builder.default_foreign_enum = default_foreign_enum
    builder.no_default_foreign_enum = no_default_foreign_enum
    builder.package_ = package_
    builder.result = result
    builder.other = other
    builder.o = o
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other_: Any?): Boolean {
    if (other_ === this) return true
    if (other_ !is SimpleMessage) return false
    return unknownFields == other_.unknownFields
        && optional_int32 == other_.optional_int32
        && optional_nested_msg == other_.optional_nested_msg
        && optional_external_msg == other_.optional_external_msg
        && default_nested_enum == other_.default_nested_enum
        && required_int32 == other_.required_int32
        && repeated_double == other_.repeated_double
        && default_foreign_enum == other_.default_foreign_enum
        && no_default_foreign_enum == other_.no_default_foreign_enum
        && package_ == other_.package_
        && result == other_.result
        && other == other_.other
        && o == other_.o
  }

  override fun hashCode(): Int {
    var result_ = super.hashCode
    if (result_ == 0) {
      result_ = unknownFields.hashCode()
      result_ = result_ * 37 + optional_int32.hashCode()
      result_ = result_ * 37 + optional_nested_msg.hashCode()
      result_ = result_ * 37 + optional_external_msg.hashCode()
      result_ = result_ * 37 + default_nested_enum.hashCode()
      result_ = result_ * 37 + required_int32.hashCode()
      result_ = result_ * 37 + repeated_double.hashCode()
      result_ = result_ * 37 + default_foreign_enum.hashCode()
      result_ = result_ * 37 + no_default_foreign_enum.hashCode()
      result_ = result_ * 37 + package_.hashCode()
      result_ = result_ * 37 + result.hashCode()
      result_ = result_ * 37 + other.hashCode()
      result_ = result_ * 37 + o.hashCode()
      super.hashCode = result_
    }
    return result_
  }

  override fun toString(): String {
    val result_ = mutableListOf<String>()
    if (optional_int32 != null) result_ += """optional_int32=$optional_int32"""
    if (optional_nested_msg != null) result_ += """optional_nested_msg=$optional_nested_msg"""
    if (optional_external_msg != null) result_ += """optional_external_msg=$optional_external_msg"""
    if (default_nested_enum != null) result_ += """default_nested_enum=$default_nested_enum"""
    result_ += """required_int32=$required_int32"""
    if (repeated_double.isNotEmpty()) result_ += """repeated_double=$repeated_double"""
    if (default_foreign_enum != null) result_ += """default_foreign_enum=$default_foreign_enum"""
    if (no_default_foreign_enum != null) result_ +=
        """no_default_foreign_enum=$no_default_foreign_enum"""
    if (package_ != null) result_ += """package_=$package_"""
    if (result != null) result_ += """result=$result"""
    if (other != null) result_ += """other=$other"""
    if (o != null) result_ += """o=$o"""
    return result_.joinToString(prefix = "SimpleMessage{", separator = ", ", postfix = "}")
  }

  fun copy(
    optional_int32: Int? = this.optional_int32,
    optional_nested_msg: NestedMessage? = this.optional_nested_msg,
    optional_external_msg: ExternalMessage? = this.optional_external_msg,
    default_nested_enum: NestedEnum? = this.default_nested_enum,
    required_int32: Int = this.required_int32,
    repeated_double: List<Double> = this.repeated_double,
    default_foreign_enum: ForeignEnum? = this.default_foreign_enum,
    no_default_foreign_enum: ForeignEnum? = this.no_default_foreign_enum,
    package_: String? = this.package_,
    result: String? = this.result,
    other: String? = this.other,
    o: String? = this.o,
    unknownFields: ByteString = this.unknownFields
  ): SimpleMessage = SimpleMessage(optional_int32, optional_nested_msg, optional_external_msg,
      default_nested_enum, required_int32, repeated_double, default_foreign_enum,
      no_default_foreign_enum, package_, result, other, o, unknownFields)

  class Builder : Message.Builder<SimpleMessage, Builder>() {
    @JvmField
    var optional_int32: Int? = null

    @JvmField
    var optional_nested_msg: NestedMessage? = null

    @JvmField
    var optional_external_msg: ExternalMessage? = null

    @JvmField
    var default_nested_enum: NestedEnum? = null

    @JvmField
    var required_int32: Int? = null

    @JvmField
    var repeated_double: List<Double> = emptyList()

    @JvmField
    var default_foreign_enum: ForeignEnum? = null

    @JvmField
    var no_default_foreign_enum: ForeignEnum? = null

    @JvmField
    var package_: String? = null

    @JvmField
    var result: String? = null

    @JvmField
    var other: String? = null

    @JvmField
    var o: String? = null

    /**
     * An optional int32
     */
    fun optional_int32(optional_int32: Int?): Builder {
      this.optional_int32 = optional_int32
      return this
    }

    /**
     * An optional NestedMessage, deprecated
     */
    @Deprecated(message = "optional_nested_msg is deprecated")
    fun optional_nested_msg(optional_nested_msg: NestedMessage?): Builder {
      this.optional_nested_msg = optional_nested_msg
      return this
    }

    /**
     * An optional ExternalMessage
     */
    fun optional_external_msg(optional_external_msg: ExternalMessage?): Builder {
      this.optional_external_msg = optional_external_msg
      return this
    }

    fun default_nested_enum(default_nested_enum: NestedEnum?): Builder {
      this.default_nested_enum = default_nested_enum
      return this
    }

    /**
     * A required int32
     */
    fun required_int32(required_int32: Int): Builder {
      this.required_int32 = required_int32
      return this
    }

    /**
     * A repeated double, deprecated
     */
    @Deprecated(message = "repeated_double is deprecated")
    fun repeated_double(repeated_double: List<Double>): Builder {
      checkElementsNotNull(repeated_double)
      this.repeated_double = repeated_double
      return this
    }

    /**
     * enum from another package with an explicit default
     */
    fun default_foreign_enum(default_foreign_enum: ForeignEnum?): Builder {
      this.default_foreign_enum = default_foreign_enum
      return this
    }

    /**
     * enum from another package without an explicit default
     */
    fun no_default_foreign_enum(no_default_foreign_enum: ForeignEnum?): Builder {
      this.no_default_foreign_enum = no_default_foreign_enum
      return this
    }

    /**
     * field with the same name as a Java keyword
     */
    fun package_(package_: String?): Builder {
      this.package_ = package_
      return this
    }

    /**
     * field with the name "result"
     */
    fun result(result: String?): Builder {
      this.result = result
      return this
    }

    /**
     * field with the name "other"
     */
    fun other(other: String?): Builder {
      this.other = other
      return this
    }

    /**
     * field with the name "o"
     */
    fun o(o: String?): Builder {
      this.o = o
      return this
    }

    override fun build(): SimpleMessage = SimpleMessage(
      optional_int32 = optional_int32,
      optional_nested_msg = optional_nested_msg,
      optional_external_msg = optional_external_msg,
      default_nested_enum = default_nested_enum,
      required_int32 = required_int32 ?: throw missingRequiredFields(required_int32,
          "required_int32"),
      repeated_double = repeated_double,
      default_foreign_enum = default_foreign_enum,
      no_default_foreign_enum = no_default_foreign_enum,
      package_ = package_,
      result = result,
      other = other,
      o = o,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    const val DEFAULT_OPTIONAL_INT32: Int = 123

    @JvmField
    val DEFAULT_DEFAULT_NESTED_ENUM: NestedEnum = NestedEnum.BAZ

    const val DEFAULT_REQUIRED_INT32: Int = 456

    @JvmField
    val DEFAULT_DEFAULT_FOREIGN_ENUM: ForeignEnum = ForeignEnum.BAX

    @JvmField
    val ADAPTER: ProtoAdapter<SimpleMessage> = object : ProtoAdapter<SimpleMessage>(
      FieldEncoding.LENGTH_DELIMITED, 
      SimpleMessage::class
    ) {
      override fun encodedSize(value: SimpleMessage): Int = 
        ProtoAdapter.INT32.encodedSizeWithTag(1, value.optional_int32) +
        NestedMessage.ADAPTER.encodedSizeWithTag(2, value.optional_nested_msg) +
        ExternalMessage.ADAPTER.encodedSizeWithTag(3, value.optional_external_msg) +
        NestedEnum.ADAPTER.encodedSizeWithTag(4, value.default_nested_enum) +
        ProtoAdapter.INT32.encodedSizeWithTag(5, value.required_int32) +
        ProtoAdapter.DOUBLE.asRepeated().encodedSizeWithTag(6, value.repeated_double) +
        ForeignEnum.ADAPTER.encodedSizeWithTag(7, value.default_foreign_enum) +
        ForeignEnum.ADAPTER.encodedSizeWithTag(8, value.no_default_foreign_enum) +
        ProtoAdapter.STRING.encodedSizeWithTag(9, value.package_) +
        ProtoAdapter.STRING.encodedSizeWithTag(10, value.result) +
        ProtoAdapter.STRING.encodedSizeWithTag(11, value.other) +
        ProtoAdapter.STRING.encodedSizeWithTag(12, value.o) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: SimpleMessage) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.optional_int32)
        NestedMessage.ADAPTER.encodeWithTag(writer, 2, value.optional_nested_msg)
        ExternalMessage.ADAPTER.encodeWithTag(writer, 3, value.optional_external_msg)
        NestedEnum.ADAPTER.encodeWithTag(writer, 4, value.default_nested_enum)
        ProtoAdapter.INT32.encodeWithTag(writer, 5, value.required_int32)
        ProtoAdapter.DOUBLE.asRepeated().encodeWithTag(writer, 6, value.repeated_double)
        ForeignEnum.ADAPTER.encodeWithTag(writer, 7, value.default_foreign_enum)
        ForeignEnum.ADAPTER.encodeWithTag(writer, 8, value.no_default_foreign_enum)
        ProtoAdapter.STRING.encodeWithTag(writer, 9, value.package_)
        ProtoAdapter.STRING.encodeWithTag(writer, 10, value.result)
        ProtoAdapter.STRING.encodeWithTag(writer, 11, value.other)
        ProtoAdapter.STRING.encodeWithTag(writer, 12, value.o)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): SimpleMessage {
        var optional_int32: Int? = null
        var optional_nested_msg: NestedMessage? = null
        var optional_external_msg: ExternalMessage? = null
        var default_nested_enum: NestedEnum? = null
        var required_int32: Int? = null
        val repeated_double = mutableListOf<Double>()
        var default_foreign_enum: ForeignEnum? = null
        var no_default_foreign_enum: ForeignEnum? = null
        var package_: String? = null
        var result: String? = null
        var other: String? = null
        var o: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> optional_int32 = ProtoAdapter.INT32.decode(reader)
            2 -> optional_nested_msg = NestedMessage.ADAPTER.decode(reader)
            3 -> optional_external_msg = ExternalMessage.ADAPTER.decode(reader)
            4 -> try {
              default_nested_enum = NestedEnum.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            5 -> required_int32 = ProtoAdapter.INT32.decode(reader)
            6 -> repeated_double.add(ProtoAdapter.DOUBLE.decode(reader))
            7 -> try {
              default_foreign_enum = ForeignEnum.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            8 -> try {
              no_default_foreign_enum = ForeignEnum.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            9 -> package_ = ProtoAdapter.STRING.decode(reader)
            10 -> result = ProtoAdapter.STRING.decode(reader)
            11 -> other = ProtoAdapter.STRING.decode(reader)
            12 -> o = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return SimpleMessage(
          optional_int32 = optional_int32,
          optional_nested_msg = optional_nested_msg,
          optional_external_msg = optional_external_msg,
          default_nested_enum = default_nested_enum,
          required_int32 = required_int32 ?: throw missingRequiredFields(required_int32,
              "required_int32"),
          repeated_double = repeated_double,
          default_foreign_enum = default_foreign_enum,
          no_default_foreign_enum = no_default_foreign_enum,
          package_ = package_,
          result = result,
          other = other,
          o = o,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: SimpleMessage): SimpleMessage = value.copy(
        optional_nested_msg = value.optional_nested_msg?.let(NestedMessage.ADAPTER::redact),
        optional_external_msg = value.optional_external_msg?.let(ExternalMessage.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }
  }

  class NestedMessage(
    /**
     * An optional int32
     */
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
    )
    @JvmField
    val bb: Int? = null,
    unknownFields: ByteString = ByteString.EMPTY
  ) : Message<NestedMessage, NestedMessage.Builder>(ADAPTER, unknownFields) {
    override fun newBuilder(): Builder {
      val builder = Builder()
      builder.bb = bb
      builder.addUnknownFields(unknownFields)
      return builder
    }

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is NestedMessage) return false
      return unknownFields == other.unknownFields
          && bb == other.bb
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + bb.hashCode()
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      if (bb != null) result += """bb=$bb"""
      return result.joinToString(prefix = "NestedMessage{", separator = ", ", postfix = "}")
    }

    fun copy(bb: Int? = this.bb, unknownFields: ByteString = this.unknownFields): NestedMessage =
        NestedMessage(bb, unknownFields)

    class Builder : Message.Builder<NestedMessage, Builder>() {
      @JvmField
      var bb: Int? = null

      /**
       * An optional int32
       */
      fun bb(bb: Int?): Builder {
        this.bb = bb
        return this
      }

      override fun build(): NestedMessage = NestedMessage(
        bb = bb,
        unknownFields = buildUnknownFields()
      )
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<NestedMessage> = object : ProtoAdapter<NestedMessage>(
        FieldEncoding.LENGTH_DELIMITED, 
        NestedMessage::class
      ) {
        override fun encodedSize(value: NestedMessage): Int = 
          ProtoAdapter.INT32.encodedSizeWithTag(1, value.bb) +
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: NestedMessage) {
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.bb)
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): NestedMessage {
          var bb: Int? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> bb = ProtoAdapter.INT32.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return NestedMessage(
            bb = bb,
            unknownFields = unknownFields
          )
        }

        override fun redact(value: NestedMessage): NestedMessage = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  enum class NestedEnum(
    override val value: Int
  ) : WireEnum {
    FOO(1),

    BAR(2),

    BAZ(3),

    @Deprecated(message = "BUZ is deprecated")
    BUZ(3);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<NestedEnum> = object : EnumAdapter<NestedEnum>(
        NestedEnum::class
      ) {
        override fun fromValue(value: Int): NestedEnum? = NestedEnum.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): NestedEnum? = when (value) {
        1 -> FOO
        2 -> BAR
        3 -> BAZ
        3 -> BUZ
        else -> null
      }
    }
  }
}
