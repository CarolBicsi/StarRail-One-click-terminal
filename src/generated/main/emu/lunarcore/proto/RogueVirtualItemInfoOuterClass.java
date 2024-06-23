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

public final class RogueVirtualItemInfoOuterClass {
  /**
   * Protobuf type {@code RogueVirtualItemInfo}
   */
  public static final class RogueVirtualItemInfo extends ProtoMessage<RogueVirtualItemInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  uint32 JLGAKDGCBOH = 7;
     * </pre>
     *
     * <code>optional uint32 rogue_coin = 8;</code>
     */
    private int rogueCoin;

    private RogueVirtualItemInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueVirtualItemInfo}
     */
    public static RogueVirtualItemInfo newInstance() {
      return new RogueVirtualItemInfo();
    }

    /**
     * <pre>
     *  uint32 JLGAKDGCBOH = 7;
     * </pre>
     *
     * <code>optional uint32 rogue_coin = 8;</code>
     * @return whether the rogueCoin field is set
     */
    public boolean hasRogueCoin() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  uint32 JLGAKDGCBOH = 7;
     * </pre>
     *
     * <code>optional uint32 rogue_coin = 8;</code>
     * @return this
     */
    public RogueVirtualItemInfo clearRogueCoin() {
      bitField0_ &= ~0x00000001;
      rogueCoin = 0;
      return this;
    }

    /**
     * <pre>
     *  uint32 JLGAKDGCBOH = 7;
     * </pre>
     *
     * <code>optional uint32 rogue_coin = 8;</code>
     * @return the rogueCoin
     */
    public int getRogueCoin() {
      return rogueCoin;
    }

    /**
     * <pre>
     *  uint32 JLGAKDGCBOH = 7;
     * </pre>
     *
     * <code>optional uint32 rogue_coin = 8;</code>
     * @param value the rogueCoin to set
     * @return this
     */
    public RogueVirtualItemInfo setRogueCoin(final int value) {
      bitField0_ |= 0x00000001;
      rogueCoin = value;
      return this;
    }

    @Override
    public RogueVirtualItemInfo copyFrom(final RogueVirtualItemInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueCoin = other.rogueCoin;
      }
      return this;
    }

    @Override
    public RogueVirtualItemInfo mergeFrom(final RogueVirtualItemInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueCoin()) {
        setRogueCoin(other.rogueCoin);
      }
      return this;
    }

    @Override
    public RogueVirtualItemInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueCoin = 0;
      return this;
    }

    @Override
    public RogueVirtualItemInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueVirtualItemInfo)) {
        return false;
      }
      RogueVirtualItemInfo other = (RogueVirtualItemInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueCoin() || rogueCoin == other.rogueCoin);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(rogueCoin);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rogueCoin);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueVirtualItemInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // rogueCoin
            rogueCoin = input.readUInt32();
            bitField0_ |= 0x00000001;
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
        output.writeUInt32(FieldNames.rogueCoin, rogueCoin);
      }
      output.endObject();
    }

    @Override
    public RogueVirtualItemInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 655631243:
          case -1124761130: {
            if (input.isAtField(FieldNames.rogueCoin)) {
              if (!input.trySkipNullValue()) {
                rogueCoin = input.readUInt32();
                bitField0_ |= 0x00000001;
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
    public RogueVirtualItemInfo clone() {
      return new RogueVirtualItemInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueVirtualItemInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueVirtualItemInfo(), data).checkInitialized();
    }

    public static RogueVirtualItemInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueVirtualItemInfo(), input).checkInitialized();
    }

    public static RogueVirtualItemInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueVirtualItemInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueVirtualItemInfo messages
     */
    public static MessageFactory<RogueVirtualItemInfo> getFactory() {
      return RogueVirtualItemInfoFactory.INSTANCE;
    }

    private enum RogueVirtualItemInfoFactory implements MessageFactory<RogueVirtualItemInfo> {
      INSTANCE;

      @Override
      public RogueVirtualItemInfo create() {
        return RogueVirtualItemInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueCoin = FieldName.forField("rogueCoin", "rogue_coin");
    }
  }
}