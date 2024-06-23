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

public final class ChessRogueNousDiceSurfaceInfoOuterClass {
  /**
   * Protobuf type {@code ChessRogueNousDiceSurfaceInfo}
   */
  public static final class ChessRogueNousDiceSurfaceInfo extends ProtoMessage<ChessRogueNousDiceSurfaceInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 index = 5;</code>
     */
    private int index;

    /**
     * <code>optional uint32 dice_id = 9;</code>
     */
    private int diceId;

    private ChessRogueNousDiceSurfaceInfo() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueNousDiceSurfaceInfo}
     */
    public static ChessRogueNousDiceSurfaceInfo newInstance() {
      return new ChessRogueNousDiceSurfaceInfo();
    }

    /**
     * <code>optional uint32 index = 5;</code>
     * @return whether the index field is set
     */
    public boolean hasIndex() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 index = 5;</code>
     * @return this
     */
    public ChessRogueNousDiceSurfaceInfo clearIndex() {
      bitField0_ &= ~0x00000001;
      index = 0;
      return this;
    }

    /**
     * <code>optional uint32 index = 5;</code>
     * @return the index
     */
    public int getIndex() {
      return index;
    }

    /**
     * <code>optional uint32 index = 5;</code>
     * @param value the index to set
     * @return this
     */
    public ChessRogueNousDiceSurfaceInfo setIndex(final int value) {
      bitField0_ |= 0x00000001;
      index = value;
      return this;
    }

    /**
     * <code>optional uint32 dice_id = 9;</code>
     * @return whether the diceId field is set
     */
    public boolean hasDiceId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 dice_id = 9;</code>
     * @return this
     */
    public ChessRogueNousDiceSurfaceInfo clearDiceId() {
      bitField0_ &= ~0x00000002;
      diceId = 0;
      return this;
    }

    /**
     * <code>optional uint32 dice_id = 9;</code>
     * @return the diceId
     */
    public int getDiceId() {
      return diceId;
    }

    /**
     * <code>optional uint32 dice_id = 9;</code>
     * @param value the diceId to set
     * @return this
     */
    public ChessRogueNousDiceSurfaceInfo setDiceId(final int value) {
      bitField0_ |= 0x00000002;
      diceId = value;
      return this;
    }

    @Override
    public ChessRogueNousDiceSurfaceInfo copyFrom(final ChessRogueNousDiceSurfaceInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        index = other.index;
        diceId = other.diceId;
      }
      return this;
    }

    @Override
    public ChessRogueNousDiceSurfaceInfo mergeFrom(final ChessRogueNousDiceSurfaceInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasIndex()) {
        setIndex(other.index);
      }
      if (other.hasDiceId()) {
        setDiceId(other.diceId);
      }
      return this;
    }

    @Override
    public ChessRogueNousDiceSurfaceInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      index = 0;
      diceId = 0;
      return this;
    }

    @Override
    public ChessRogueNousDiceSurfaceInfo clearQuick() {
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
      if (!(o instanceof ChessRogueNousDiceSurfaceInfo)) {
        return false;
      }
      ChessRogueNousDiceSurfaceInfo other = (ChessRogueNousDiceSurfaceInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasIndex() || index == other.index)
        && (!hasDiceId() || diceId == other.diceId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(index);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(diceId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(index);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(diceId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueNousDiceSurfaceInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // index
            index = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // diceId
            diceId = input.readUInt32();
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
        output.writeUInt32(FieldNames.index, index);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.diceId, diceId);
      }
      output.endObject();
    }

    @Override
    public ChessRogueNousDiceSurfaceInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 100346066: {
            if (input.isAtField(FieldNames.index)) {
              if (!input.trySkipNullValue()) {
                index = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1332033758:
          case 1656647859: {
            if (input.isAtField(FieldNames.diceId)) {
              if (!input.trySkipNullValue()) {
                diceId = input.readUInt32();
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
    public ChessRogueNousDiceSurfaceInfo clone() {
      return new ChessRogueNousDiceSurfaceInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueNousDiceSurfaceInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueNousDiceSurfaceInfo(), data).checkInitialized();
    }

    public static ChessRogueNousDiceSurfaceInfo parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChessRogueNousDiceSurfaceInfo(), input).checkInitialized();
    }

    public static ChessRogueNousDiceSurfaceInfo parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChessRogueNousDiceSurfaceInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueNousDiceSurfaceInfo messages
     */
    public static MessageFactory<ChessRogueNousDiceSurfaceInfo> getFactory() {
      return ChessRogueNousDiceSurfaceInfoFactory.INSTANCE;
    }

    private enum ChessRogueNousDiceSurfaceInfoFactory implements MessageFactory<ChessRogueNousDiceSurfaceInfo> {
      INSTANCE;

      @Override
      public ChessRogueNousDiceSurfaceInfo create() {
        return ChessRogueNousDiceSurfaceInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName index = FieldName.forField("index");

      static final FieldName diceId = FieldName.forField("diceId", "dice_id");
    }
  }
}
