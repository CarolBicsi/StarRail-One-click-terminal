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
import us.hebi.quickbuf.Utf8String;

public final class SetGroupCustomSaveDataCsReqOuterClass {
  /**
   * Protobuf type {@code SetGroupCustomSaveDataCsReq}
   */
  public static final class SetGroupCustomSaveDataCsReq extends ProtoMessage<SetGroupCustomSaveDataCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 entry_id = 10;</code>
     */
    private int entryId;

    /**
     * <code>optional uint32 group_id = 14;</code>
     */
    private int groupId;

    /**
     * <code>optional string group_save_data = 6;</code>
     */
    private final Utf8String groupSaveData = Utf8String.newEmptyInstance();

    private SetGroupCustomSaveDataCsReq() {
    }

    /**
     * @return a new empty instance of {@code SetGroupCustomSaveDataCsReq}
     */
    public static SetGroupCustomSaveDataCsReq newInstance() {
      return new SetGroupCustomSaveDataCsReq();
    }

    /**
     * <code>optional uint32 entry_id = 10;</code>
     * @return whether the entryId field is set
     */
    public boolean hasEntryId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 entry_id = 10;</code>
     * @return this
     */
    public SetGroupCustomSaveDataCsReq clearEntryId() {
      bitField0_ &= ~0x00000001;
      entryId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entry_id = 10;</code>
     * @return the entryId
     */
    public int getEntryId() {
      return entryId;
    }

    /**
     * <code>optional uint32 entry_id = 10;</code>
     * @param value the entryId to set
     * @return this
     */
    public SetGroupCustomSaveDataCsReq setEntryId(final int value) {
      bitField0_ |= 0x00000001;
      entryId = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 14;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 group_id = 14;</code>
     * @return this
     */
    public SetGroupCustomSaveDataCsReq clearGroupId() {
      bitField0_ &= ~0x00000002;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 14;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 14;</code>
     * @param value the groupId to set
     * @return this
     */
    public SetGroupCustomSaveDataCsReq setGroupId(final int value) {
      bitField0_ |= 0x00000002;
      groupId = value;
      return this;
    }

    /**
     * <code>optional string group_save_data = 6;</code>
     * @return whether the groupSaveData field is set
     */
    public boolean hasGroupSaveData() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional string group_save_data = 6;</code>
     * @return this
     */
    public SetGroupCustomSaveDataCsReq clearGroupSaveData() {
      bitField0_ &= ~0x00000004;
      groupSaveData.clear();
      return this;
    }

    /**
     * <code>optional string group_save_data = 6;</code>
     * @return the groupSaveData
     */
    public String getGroupSaveData() {
      return groupSaveData.getString();
    }

    /**
     * <code>optional string group_save_data = 6;</code>
     * @return internal {@code Utf8String} representation of groupSaveData for reading
     */
    public Utf8String getGroupSaveDataBytes() {
      return this.groupSaveData;
    }

    /**
     * <code>optional string group_save_data = 6;</code>
     * @return internal {@code Utf8String} representation of groupSaveData for modifications
     */
    public Utf8String getMutableGroupSaveDataBytes() {
      bitField0_ |= 0x00000004;
      return this.groupSaveData;
    }

    /**
     * <code>optional string group_save_data = 6;</code>
     * @param value the groupSaveData to set
     * @return this
     */
    public SetGroupCustomSaveDataCsReq setGroupSaveData(final CharSequence value) {
      bitField0_ |= 0x00000004;
      groupSaveData.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string group_save_data = 6;</code>
     * @param value the groupSaveData to set
     * @return this
     */
    public SetGroupCustomSaveDataCsReq setGroupSaveData(final Utf8String value) {
      bitField0_ |= 0x00000004;
      groupSaveData.copyFrom(value);
      return this;
    }

    @Override
    public SetGroupCustomSaveDataCsReq copyFrom(final SetGroupCustomSaveDataCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        entryId = other.entryId;
        groupId = other.groupId;
        groupSaveData.copyFrom(other.groupSaveData);
      }
      return this;
    }

    @Override
    public SetGroupCustomSaveDataCsReq mergeFrom(final SetGroupCustomSaveDataCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEntryId()) {
        setEntryId(other.entryId);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasGroupSaveData()) {
        getMutableGroupSaveDataBytes().copyFrom(other.groupSaveData);
      }
      return this;
    }

    @Override
    public SetGroupCustomSaveDataCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entryId = 0;
      groupId = 0;
      groupSaveData.clear();
      return this;
    }

    @Override
    public SetGroupCustomSaveDataCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupSaveData.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SetGroupCustomSaveDataCsReq)) {
        return false;
      }
      SetGroupCustomSaveDataCsReq other = (SetGroupCustomSaveDataCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasEntryId() || entryId == other.entryId)
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasGroupSaveData() || groupSaveData.equals(other.groupSaveData));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(entryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 50);
        output.writeStringNoTag(groupSaveData);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(groupSaveData);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetGroupCustomSaveDataCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // entryId
            entryId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // groupSaveData
            input.readString(groupSaveData);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.entryId, entryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeString(FieldNames.groupSaveData, groupSaveData);
      }
      output.endObject();
    }

    @Override
    public SetGroupCustomSaveDataCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1591558867:
          case -2093663224: {
            if (input.isAtField(FieldNames.entryId)) {
              if (!input.trySkipNullValue()) {
                entryId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -20477338:
          case -2125632660: {
            if (input.isAtField(FieldNames.groupSaveData)) {
              if (!input.trySkipNullValue()) {
                input.readString(groupSaveData);
                bitField0_ |= 0x00000004;
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
    public SetGroupCustomSaveDataCsReq clone() {
      return new SetGroupCustomSaveDataCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetGroupCustomSaveDataCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetGroupCustomSaveDataCsReq(), data).checkInitialized();
    }

    public static SetGroupCustomSaveDataCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SetGroupCustomSaveDataCsReq(), input).checkInitialized();
    }

    public static SetGroupCustomSaveDataCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetGroupCustomSaveDataCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetGroupCustomSaveDataCsReq messages
     */
    public static MessageFactory<SetGroupCustomSaveDataCsReq> getFactory() {
      return SetGroupCustomSaveDataCsReqFactory.INSTANCE;
    }

    private enum SetGroupCustomSaveDataCsReqFactory implements MessageFactory<SetGroupCustomSaveDataCsReq> {
      INSTANCE;

      @Override
      public SetGroupCustomSaveDataCsReq create() {
        return SetGroupCustomSaveDataCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName entryId = FieldName.forField("entryId", "entry_id");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName groupSaveData = FieldName.forField("groupSaveData", "group_save_data");
    }
  }
}
