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

public final class ComposeSelectedRelicCsReqOuterClass {
  /**
   * Protobuf type {@code ComposeSelectedRelicCsReq}
   */
  public static final class ComposeSelectedRelicCsReq extends ProtoMessage<ComposeSelectedRelicCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 main_affix_id = 4;</code>
     */
    private int mainAffixId;

    /**
     * <code>optional uint32 count = 8;</code>
     */
    private int count;

    /**
     * <code>optional uint32 compose_relic_id = 11;</code>
     */
    private int composeRelicId;

    /**
     * <code>optional uint32 compose_id = 15;</code>
     */
    private int composeId;

    /**
     * <code>optional .ItemCostList compose_item_list = 1;</code>
     */
    private final ItemCostListOuterClass.ItemCostList composeItemList = ItemCostListOuterClass.ItemCostList.newInstance();

    private ComposeSelectedRelicCsReq() {
    }

    /**
     * @return a new empty instance of {@code ComposeSelectedRelicCsReq}
     */
    public static ComposeSelectedRelicCsReq newInstance() {
      return new ComposeSelectedRelicCsReq();
    }

    /**
     * <code>optional uint32 main_affix_id = 4;</code>
     * @return whether the mainAffixId field is set
     */
    public boolean hasMainAffixId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 main_affix_id = 4;</code>
     * @return this
     */
    public ComposeSelectedRelicCsReq clearMainAffixId() {
      bitField0_ &= ~0x00000001;
      mainAffixId = 0;
      return this;
    }

    /**
     * <code>optional uint32 main_affix_id = 4;</code>
     * @return the mainAffixId
     */
    public int getMainAffixId() {
      return mainAffixId;
    }

    /**
     * <code>optional uint32 main_affix_id = 4;</code>
     * @param value the mainAffixId to set
     * @return this
     */
    public ComposeSelectedRelicCsReq setMainAffixId(final int value) {
      bitField0_ |= 0x00000001;
      mainAffixId = value;
      return this;
    }

    /**
     * <code>optional uint32 count = 8;</code>
     * @return whether the count field is set
     */
    public boolean hasCount() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 count = 8;</code>
     * @return this
     */
    public ComposeSelectedRelicCsReq clearCount() {
      bitField0_ &= ~0x00000002;
      count = 0;
      return this;
    }

    /**
     * <code>optional uint32 count = 8;</code>
     * @return the count
     */
    public int getCount() {
      return count;
    }

    /**
     * <code>optional uint32 count = 8;</code>
     * @param value the count to set
     * @return this
     */
    public ComposeSelectedRelicCsReq setCount(final int value) {
      bitField0_ |= 0x00000002;
      count = value;
      return this;
    }

    /**
     * <code>optional uint32 compose_relic_id = 11;</code>
     * @return whether the composeRelicId field is set
     */
    public boolean hasComposeRelicId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 compose_relic_id = 11;</code>
     * @return this
     */
    public ComposeSelectedRelicCsReq clearComposeRelicId() {
      bitField0_ &= ~0x00000004;
      composeRelicId = 0;
      return this;
    }

    /**
     * <code>optional uint32 compose_relic_id = 11;</code>
     * @return the composeRelicId
     */
    public int getComposeRelicId() {
      return composeRelicId;
    }

    /**
     * <code>optional uint32 compose_relic_id = 11;</code>
     * @param value the composeRelicId to set
     * @return this
     */
    public ComposeSelectedRelicCsReq setComposeRelicId(final int value) {
      bitField0_ |= 0x00000004;
      composeRelicId = value;
      return this;
    }

    /**
     * <code>optional uint32 compose_id = 15;</code>
     * @return whether the composeId field is set
     */
    public boolean hasComposeId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 compose_id = 15;</code>
     * @return this
     */
    public ComposeSelectedRelicCsReq clearComposeId() {
      bitField0_ &= ~0x00000008;
      composeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 compose_id = 15;</code>
     * @return the composeId
     */
    public int getComposeId() {
      return composeId;
    }

    /**
     * <code>optional uint32 compose_id = 15;</code>
     * @param value the composeId to set
     * @return this
     */
    public ComposeSelectedRelicCsReq setComposeId(final int value) {
      bitField0_ |= 0x00000008;
      composeId = value;
      return this;
    }

    /**
     * <code>optional .ItemCostList compose_item_list = 1;</code>
     * @return whether the composeItemList field is set
     */
    public boolean hasComposeItemList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .ItemCostList compose_item_list = 1;</code>
     * @return this
     */
    public ComposeSelectedRelicCsReq clearComposeItemList() {
      bitField0_ &= ~0x00000010;
      composeItemList.clear();
      return this;
    }

    /**
     * <code>optional .ItemCostList compose_item_list = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableComposeItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemCostListOuterClass.ItemCostList getComposeItemList() {
      return composeItemList;
    }

    /**
     * <code>optional .ItemCostList compose_item_list = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemCostListOuterClass.ItemCostList getMutableComposeItemList() {
      bitField0_ |= 0x00000010;
      return composeItemList;
    }

    /**
     * <code>optional .ItemCostList compose_item_list = 1;</code>
     * @param value the composeItemList to set
     * @return this
     */
    public ComposeSelectedRelicCsReq setComposeItemList(
        final ItemCostListOuterClass.ItemCostList value) {
      bitField0_ |= 0x00000010;
      composeItemList.copyFrom(value);
      return this;
    }

    @Override
    public ComposeSelectedRelicCsReq copyFrom(final ComposeSelectedRelicCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mainAffixId = other.mainAffixId;
        count = other.count;
        composeRelicId = other.composeRelicId;
        composeId = other.composeId;
        composeItemList.copyFrom(other.composeItemList);
      }
      return this;
    }

    @Override
    public ComposeSelectedRelicCsReq mergeFrom(final ComposeSelectedRelicCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMainAffixId()) {
        setMainAffixId(other.mainAffixId);
      }
      if (other.hasCount()) {
        setCount(other.count);
      }
      if (other.hasComposeRelicId()) {
        setComposeRelicId(other.composeRelicId);
      }
      if (other.hasComposeId()) {
        setComposeId(other.composeId);
      }
      if (other.hasComposeItemList()) {
        getMutableComposeItemList().mergeFrom(other.composeItemList);
      }
      return this;
    }

    @Override
    public ComposeSelectedRelicCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mainAffixId = 0;
      count = 0;
      composeRelicId = 0;
      composeId = 0;
      composeItemList.clear();
      return this;
    }

    @Override
    public ComposeSelectedRelicCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      composeItemList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ComposeSelectedRelicCsReq)) {
        return false;
      }
      ComposeSelectedRelicCsReq other = (ComposeSelectedRelicCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasMainAffixId() || mainAffixId == other.mainAffixId)
        && (!hasCount() || count == other.count)
        && (!hasComposeRelicId() || composeRelicId == other.composeRelicId)
        && (!hasComposeId() || composeId == other.composeId)
        && (!hasComposeItemList() || composeItemList.equals(other.composeItemList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(count);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(composeRelicId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(composeId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 10);
        output.writeMessageNoTag(composeItemList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(count);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(composeRelicId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(composeId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(composeItemList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ComposeSelectedRelicCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // mainAffixId
            mainAffixId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // count
            count = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // composeRelicId
            composeRelicId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // composeId
            composeId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // composeItemList
            input.readMessage(composeItemList);
            bitField0_ |= 0x00000010;
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
        output.writeUInt32(FieldNames.mainAffixId, mainAffixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.count, count);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.composeRelicId, composeRelicId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.composeId, composeId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.composeItemList, composeItemList);
      }
      output.endObject();
    }

    @Override
    public ComposeSelectedRelicCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1973876974:
          case -1426712144: {
            if (input.isAtField(FieldNames.mainAffixId)) {
              if (!input.trySkipNullValue()) {
                mainAffixId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 94851343: {
            if (input.isAtField(FieldNames.count)) {
              if (!input.trySkipNullValue()) {
                count = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1424923132:
          case 885799284: {
            if (input.isAtField(FieldNames.composeRelicId)) {
              if (!input.trySkipNullValue()) {
                composeRelicId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1399759283:
          case -442843416: {
            if (input.isAtField(FieldNames.composeId)) {
              if (!input.trySkipNullValue()) {
                composeId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1347157501:
          case -656801827: {
            if (input.isAtField(FieldNames.composeItemList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(composeItemList);
                bitField0_ |= 0x00000010;
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
    public ComposeSelectedRelicCsReq clone() {
      return new ComposeSelectedRelicCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ComposeSelectedRelicCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ComposeSelectedRelicCsReq(), data).checkInitialized();
    }

    public static ComposeSelectedRelicCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ComposeSelectedRelicCsReq(), input).checkInitialized();
    }

    public static ComposeSelectedRelicCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ComposeSelectedRelicCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ComposeSelectedRelicCsReq messages
     */
    public static MessageFactory<ComposeSelectedRelicCsReq> getFactory() {
      return ComposeSelectedRelicCsReqFactory.INSTANCE;
    }

    private enum ComposeSelectedRelicCsReqFactory implements MessageFactory<ComposeSelectedRelicCsReq> {
      INSTANCE;

      @Override
      public ComposeSelectedRelicCsReq create() {
        return ComposeSelectedRelicCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mainAffixId = FieldName.forField("mainAffixId", "main_affix_id");

      static final FieldName count = FieldName.forField("count");

      static final FieldName composeRelicId = FieldName.forField("composeRelicId", "compose_relic_id");

      static final FieldName composeId = FieldName.forField("composeId", "compose_id");

      static final FieldName composeItemList = FieldName.forField("composeItemList", "compose_item_list");
    }
  }
}
