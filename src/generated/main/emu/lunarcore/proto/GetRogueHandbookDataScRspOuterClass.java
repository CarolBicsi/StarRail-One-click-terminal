// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class GetRogueHandbookDataScRspOuterClass {
  /**
   * Protobuf type {@code GetRogueHandbookDataScRsp}
   */
  public static final class GetRogueHandbookDataScRsp extends ProtoMessage<GetRogueHandbookDataScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 12;</code>
     */
    private int retcode;

    /**
     * <code>optional .RogueHandbookData handbook_info = 15;</code>
     */
    private final RogueHandbookDataOuterClass.RogueHandbookData handbookInfo = RogueHandbookDataOuterClass.RogueHandbookData.newInstance();

    private GetRogueHandbookDataScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetRogueHandbookDataScRsp}
     */
    public static GetRogueHandbookDataScRsp newInstance() {
      return new GetRogueHandbookDataScRsp();
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return this
     */
    public GetRogueHandbookDataScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetRogueHandbookDataScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .RogueHandbookData handbook_info = 15;</code>
     * @return whether the handbookInfo field is set
     */
    public boolean hasHandbookInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueHandbookData handbook_info = 15;</code>
     * @return this
     */
    public GetRogueHandbookDataScRsp clearHandbookInfo() {
      bitField0_ &= ~0x00000002;
      handbookInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueHandbookData handbook_info = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableHandbookInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueHandbookDataOuterClass.RogueHandbookData getHandbookInfo() {
      return handbookInfo;
    }

    /**
     * <code>optional .RogueHandbookData handbook_info = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueHandbookDataOuterClass.RogueHandbookData getMutableHandbookInfo() {
      bitField0_ |= 0x00000002;
      return handbookInfo;
    }

    /**
     * <code>optional .RogueHandbookData handbook_info = 15;</code>
     * @param value the handbookInfo to set
     * @return this
     */
    public GetRogueHandbookDataScRsp setHandbookInfo(
        final RogueHandbookDataOuterClass.RogueHandbookData value) {
      bitField0_ |= 0x00000002;
      handbookInfo.copyFrom(value);
      return this;
    }

    @Override
    public GetRogueHandbookDataScRsp copyFrom(final GetRogueHandbookDataScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        handbookInfo.copyFrom(other.handbookInfo);
      }
      return this;
    }

    @Override
    public GetRogueHandbookDataScRsp mergeFrom(final GetRogueHandbookDataScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasHandbookInfo()) {
        getMutableHandbookInfo().mergeFrom(other.handbookInfo);
      }
      return this;
    }

    @Override
    public GetRogueHandbookDataScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      handbookInfo.clear();
      return this;
    }

    @Override
    public GetRogueHandbookDataScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      handbookInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetRogueHandbookDataScRsp)) {
        return false;
      }
      GetRogueHandbookDataScRsp other = (GetRogueHandbookDataScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasHandbookInfo() || handbookInfo.equals(other.handbookInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 122);
        output.writeMessageNoTag(handbookInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(handbookInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetRogueHandbookDataScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // handbookInfo
            input.readMessage(handbookInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.handbookInfo, handbookInfo);
      }
      output.endObject();
    }

    @Override
    public GetRogueHandbookDataScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -460040026:
          case -1356162891: {
            if (input.isAtField(FieldNames.handbookInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(handbookInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public GetRogueHandbookDataScRsp clone() {
      return new GetRogueHandbookDataScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetRogueHandbookDataScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetRogueHandbookDataScRsp(), data).checkInitialized();
    }

    public static GetRogueHandbookDataScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetRogueHandbookDataScRsp(), input).checkInitialized();
    }

    public static GetRogueHandbookDataScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetRogueHandbookDataScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetRogueHandbookDataScRsp messages
     */
    public static MessageFactory<GetRogueHandbookDataScRsp> getFactory() {
      return GetRogueHandbookDataScRspFactory.INSTANCE;
    }

    private enum GetRogueHandbookDataScRspFactory implements MessageFactory<GetRogueHandbookDataScRsp> {
      INSTANCE;

      @Override
      public GetRogueHandbookDataScRsp create() {
        return GetRogueHandbookDataScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName handbookInfo = FieldName.forField("handbookInfo", "handbook_info");
    }
  }
}