// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class FriendApplySourceOuterClass {
  /**
   * Protobuf enum {@code FriendApplySource}
   */
  public enum FriendApplySource implements ProtoEnum<FriendApplySource> {
    /**
     * <code>FRIEND_APPLY_SOURCE_NONE = 0;</code>
     */
    FRIEND_APPLY_SOURCE_NONE("FRIEND_APPLY_SOURCE_NONE", 0),

    /**
     * <code>FRIEND_APPLY_SOURCE_SEARCH = 1;</code>
     */
    FRIEND_APPLY_SOURCE_SEARCH("FRIEND_APPLY_SOURCE_SEARCH", 1),

    /**
     * <code>FRIEND_APPLY_SOURCE_RECOMMEND = 2;</code>
     */
    FRIEND_APPLY_SOURCE_RECOMMEND("FRIEND_APPLY_SOURCE_RECOMMEND", 2),

    /**
     * <code>FRIEND_APPLY_SOURCE_ASSIST = 3;</code>
     */
    FRIEND_APPLY_SOURCE_ASSIST("FRIEND_APPLY_SOURCE_ASSIST", 3),

    /**
     * <code>FRIEND_APPLY_SOURCE_RECOMMEND_ASSIST = 4;</code>
     */
    FRIEND_APPLY_SOURCE_RECOMMEND_ASSIST("FRIEND_APPLY_SOURCE_RECOMMEND_ASSIST", 4),

    /**
     * <code>FRIEND_APPLY_SOURCE_PSN_FRIEND = 5;</code>
     */
    FRIEND_APPLY_SOURCE_PSN_FRIEND("FRIEND_APPLY_SOURCE_PSN_FRIEND", 5);

    /**
     * <code>FRIEND_APPLY_SOURCE_NONE = 0;</code>
     */
    public static final int FRIEND_APPLY_SOURCE_NONE_VALUE = 0;

    /**
     * <code>FRIEND_APPLY_SOURCE_SEARCH = 1;</code>
     */
    public static final int FRIEND_APPLY_SOURCE_SEARCH_VALUE = 1;

    /**
     * <code>FRIEND_APPLY_SOURCE_RECOMMEND = 2;</code>
     */
    public static final int FRIEND_APPLY_SOURCE_RECOMMEND_VALUE = 2;

    /**
     * <code>FRIEND_APPLY_SOURCE_ASSIST = 3;</code>
     */
    public static final int FRIEND_APPLY_SOURCE_ASSIST_VALUE = 3;

    /**
     * <code>FRIEND_APPLY_SOURCE_RECOMMEND_ASSIST = 4;</code>
     */
    public static final int FRIEND_APPLY_SOURCE_RECOMMEND_ASSIST_VALUE = 4;

    /**
     * <code>FRIEND_APPLY_SOURCE_PSN_FRIEND = 5;</code>
     */
    public static final int FRIEND_APPLY_SOURCE_PSN_FRIEND_VALUE = 5;

    private final String name;

    private final int number;

    private FriendApplySource(String name, int number) {
      this.name = name;
      this.number = number;
    }

    /**
     * @return the string representation of enum entry
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * @return the numeric wire value of this enum entry
     */
    @Override
    public int getNumber() {
      return number;
    }

    /**
     * @return a converter that maps between this enum's numeric and text representations
     */
    public static ProtoEnum.EnumConverter<FriendApplySource> converter() {
      return FriendApplySourceConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static FriendApplySource forNumber(int value) {
      return FriendApplySourceConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static FriendApplySource forNumberOr(int number, FriendApplySource other) {
      FriendApplySource value = forNumber(number);
      return value == null ? other : value;
    }

    enum FriendApplySourceConverter implements ProtoEnum.EnumConverter<FriendApplySource> {
      INSTANCE;

      private static final FriendApplySource[] lookup = new FriendApplySource[6];

      static {
        lookup[0] = FRIEND_APPLY_SOURCE_NONE;
        lookup[1] = FRIEND_APPLY_SOURCE_SEARCH;
        lookup[2] = FRIEND_APPLY_SOURCE_RECOMMEND;
        lookup[3] = FRIEND_APPLY_SOURCE_ASSIST;
        lookup[4] = FRIEND_APPLY_SOURCE_RECOMMEND_ASSIST;
        lookup[5] = FRIEND_APPLY_SOURCE_PSN_FRIEND;
      }

      @Override
      public final FriendApplySource forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final FriendApplySource forName(final CharSequence value) {
        switch (value.length()) {
          case 24: {
            if (ProtoUtil.isEqual("FRIEND_APPLY_SOURCE_NONE", value)) {
              return FRIEND_APPLY_SOURCE_NONE;
            }
            break;
          }
          case 26: {
            if (ProtoUtil.isEqual("FRIEND_APPLY_SOURCE_SEARCH", value)) {
              return FRIEND_APPLY_SOURCE_SEARCH;
            }
            if (ProtoUtil.isEqual("FRIEND_APPLY_SOURCE_ASSIST", value)) {
              return FRIEND_APPLY_SOURCE_ASSIST;
            }
            break;
          }
          case 29: {
            if (ProtoUtil.isEqual("FRIEND_APPLY_SOURCE_RECOMMEND", value)) {
              return FRIEND_APPLY_SOURCE_RECOMMEND;
            }
            break;
          }
          case 30: {
            if (ProtoUtil.isEqual("FRIEND_APPLY_SOURCE_PSN_FRIEND", value)) {
              return FRIEND_APPLY_SOURCE_PSN_FRIEND;
            }
            break;
          }
          case 36: {
            if (ProtoUtil.isEqual("FRIEND_APPLY_SOURCE_RECOMMEND_ASSIST", value)) {
              return FRIEND_APPLY_SOURCE_RECOMMEND_ASSIST;
            }
            break;
          }
        }
        return null;
      }
    }
  }
}
