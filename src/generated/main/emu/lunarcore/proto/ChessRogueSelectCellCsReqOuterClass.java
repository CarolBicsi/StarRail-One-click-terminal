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

public final class ChessRogueSelectCellCsReqOuterClass {
  /**
   * Protobuf type {@code ChessRogueSelectCellCsReq}
   */
  public static final class ChessRogueSelectCellCsReq extends ProtoMessage<ChessRogueSelectCellCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 cell_id = 2;</code>
     */
    private int cellId;

    private ChessRogueSelectCellCsReq() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueSelectCellCsReq}
     */
    public static ChessRogueSelectCellCsReq newInstance() {
      return new ChessRogueSelectCellCsReq();
    }

    /**
     * <code>optional uint32 cell_id = 2;</code>
     * @return whether the cellId field is set
     */
    public boolean hasCellId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 cell_id = 2;</code>
     * @return this
     */
    public ChessRogueSelectCellCsReq clearCellId() {
      bitField0_ &= ~0x00000001;
      cellId = 0;
      return this;
    }

    /**
     * <code>optional uint32 cell_id = 2;</code>
     * @return the cellId
     */
    public int getCellId() {
      return cellId;
    }

    /**
     * <code>optional uint32 cell_id = 2;</code>
     * @param value the cellId to set
     * @return this
     */
    public ChessRogueSelectCellCsReq setCellId(final int value) {
      bitField0_ |= 0x00000001;
      cellId = value;
      return this;
    }

    @Override
    public ChessRogueSelectCellCsReq copyFrom(final ChessRogueSelectCellCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        cellId = other.cellId;
      }
      return this;
    }

    @Override
    public ChessRogueSelectCellCsReq mergeFrom(final ChessRogueSelectCellCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCellId()) {
        setCellId(other.cellId);
      }
      return this;
    }

    @Override
    public ChessRogueSelectCellCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      cellId = 0;
      return this;
    }

    @Override
    public ChessRogueSelectCellCsReq clearQuick() {
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
      if (!(o instanceof ChessRogueSelectCellCsReq)) {
        return false;
      }
      ChessRogueSelectCellCsReq other = (ChessRogueSelectCellCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasCellId() || cellId == other.cellId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(cellId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(cellId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueSelectCellCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // cellId
            cellId = input.readUInt32();
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
        output.writeUInt32(FieldNames.cellId, cellId);
      }
      output.endObject();
    }

    @Override
    public ChessRogueSelectCellCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1364082147:
          case 663147800: {
            if (input.isAtField(FieldNames.cellId)) {
              if (!input.trySkipNullValue()) {
                cellId = input.readUInt32();
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
    public ChessRogueSelectCellCsReq clone() {
      return new ChessRogueSelectCellCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueSelectCellCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectCellCsReq(), data).checkInitialized();
    }

    public static ChessRogueSelectCellCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectCellCsReq(), input).checkInitialized();
    }

    public static ChessRogueSelectCellCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectCellCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueSelectCellCsReq messages
     */
    public static MessageFactory<ChessRogueSelectCellCsReq> getFactory() {
      return ChessRogueSelectCellCsReqFactory.INSTANCE;
    }

    private enum ChessRogueSelectCellCsReqFactory implements MessageFactory<ChessRogueSelectCellCsReq> {
      INSTANCE;

      @Override
      public ChessRogueSelectCellCsReq create() {
        return ChessRogueSelectCellCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName cellId = FieldName.forField("cellId", "cell_id");
    }
  }
}