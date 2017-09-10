import java.time.Instant;

/**
 * Created by ikhoon on 09/09/2017.
 */
public class Item {
    private Integer id;
    private Integer brandId;
    private Integer catalogId;
    private Integer supplyChannelId; // optional
    private String supplyChannelItemCode;
    private String supplyChannelCategoryCode;
    private String name;
    private String displayName;
    private Integer itemType;
    private Integer basicPrice;
    private Integer sellingPrice;
    private Integer discountRate;
    private Integer feeRate;
    private Byte periodType;
    private Integer validPeriod;
    private Byte pinIssueType;
    private String pinIssueCsInfo; // optional
    private Boolean isCancelable;
    private String imageUrl;  // optional
    private Integer status;
    private Boolean displayYn;
    private Short distType;  // optional
    private String detailInfo; // optional
    private String noticeInfo; // optional
    private Instant couponExpiredAt; // optional
    private Instant releasedAt;
    private Instant expiredAt;

    public Item(Integer id, Integer brandId, Integer catalogId, String supplyChannelItemCode, String supplyChannelCategoryCode, String name, String displayName, Integer itemType, Integer basicPrice, Integer sellingPrice, Integer discountRate, Integer feeRate, Byte periodType, Integer validPeriod, String pinIssueCsInfo, Boolean isCancelable, Integer status, Boolean displayYn, Instant releasedAt, Instant expiredAt) {
        this.id = id;
        this.brandId = brandId;
        this.catalogId = catalogId;
        this.supplyChannelItemCode = supplyChannelItemCode;
        this.supplyChannelCategoryCode = supplyChannelCategoryCode;
        this.name = name;
        this.displayName = displayName;
        this.itemType = itemType;
        this.basicPrice = basicPrice;
        this.sellingPrice = sellingPrice;
        this.discountRate = discountRate;
        this.feeRate = feeRate;
        this.periodType = periodType;
        this.validPeriod = validPeriod;
        this.pinIssueType = pinIssueType;
        this.pinIssueCsInfo = pinIssueCsInfo;
        this.isCancelable = isCancelable;
        this.imageUrl = imageUrl;
        this.status = status;
        this.displayYn = displayYn;
        this.releasedAt = releasedAt;
        this.expiredAt = expiredAt;
    }

    public static class Builder {
        private Integer id;
        private Integer brandId;
        private Integer catalogId;
        private Integer supplyChannelId; // optional
        private String supplyChannelItemCode;
        private String supplyChannelCategoryCode;
        private String name;
        private String displayName;
        private Integer itemType;
        private Integer basicPrice;
        private Integer sellingPrice;
        private Integer discountRate;
        private Integer feeRate;
        private Byte periodType;
        private Integer validPeriod;
        private Byte pinIssueType;
        private String pinIssueCsInfo; // optional
        private Boolean isCancelable;
        private String imageUrl;  // optional
        private Integer status;
        private Boolean displayYn;
        private Short distType;  // optional
        private String detailInfo; // optional
        private String noticeInfo; // optional
        private Instant couponExpiredAt; // optional
        private Instant releasedAt;
        private Instant expiredAt;

        public Builder(Integer id, Integer brandId, Integer catalogId, String supplyChannelItemCode, String supplyChannelCategoryCode, String name, String displayName, Integer itemType, Integer basicPrice, Integer sellingPrice, Integer discountRate, Integer feeRate, Byte periodType, Integer validPeriod, String pinIssueCsInfo, Byte pinIssueType, Boolean isCancelable, Integer status, Boolean displayYn, Instant releasedAt, Instant expiredAt) {
            this.id = id;
            this.brandId = brandId;
            this.catalogId = catalogId;
            this.supplyChannelItemCode = supplyChannelItemCode;
            this.supplyChannelCategoryCode = supplyChannelCategoryCode;
            this.name = name;
            this.displayName = displayName;
            this.itemType = itemType;
            this.basicPrice = basicPrice;
            this.sellingPrice = sellingPrice;
            this.discountRate = discountRate;
            this.feeRate = feeRate;
            this.periodType = periodType;
            this.validPeriod = validPeriod;
            this.pinIssueType = pinIssueType;
            this.pinIssueCsInfo = pinIssueCsInfo;
            this.isCancelable = isCancelable;
            this.status = status;
            this.displayYn = displayYn;
            this.releasedAt = releasedAt;
            this.expiredAt = expiredAt;
        }

        public Builder supplyChannelId(Integer val) {
            this.supplyChannelId = val;
            return this;
        }

        public Builder pinIssueCsInfo(String val) {
            this.pinIssueCsInfo = val;
            return this;
        }
        public Builder imageUrl(String val) {
            this.imageUrl = val;
            return this;
        }

        public Builder distType(Short val) {
            this.distType = val;
            return this;
        }

        public Builder detailInfo(String val) {
            this.detailInfo = val;
            return this;
        }

        public Builder noticeInfo(String val) {
            this.noticeInfo = val;
            return this;
        }

        public Builder couponExpiredAt(Instant val) {
            this.couponExpiredAt = Instant.now();
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
    private Item(Builder builder) {
        this.id = builder.id;
        this.brandId = builder.brandId;
        this.catalogId = builder.catalogId;
        this.supplyChannelItemCode = builder.supplyChannelItemCode;
        this.supplyChannelCategoryCode = builder.supplyChannelCategoryCode;
        this.name = builder.name;
        this.displayName = builder.displayName;
        this.itemType = builder.itemType;
        this.basicPrice = builder.basicPrice;
        this.sellingPrice = builder.sellingPrice;
        this.discountRate = builder.discountRate;
        this.feeRate = builder.feeRate;
        this.periodType = builder.periodType;
        this.validPeriod = builder.validPeriod;
        this.pinIssueType = builder.pinIssueType;
        this.pinIssueCsInfo = builder.pinIssueCsInfo;
        this.isCancelable = builder.isCancelable;
        this.imageUrl = builder.imageUrl;
        this.status = builder.status;
        this.displayYn = builder.displayYn;
        this.releasedAt = builder.releasedAt;
        this.expiredAt = builder.expiredAt;

        this.supplyChannelId = builder.supplyChannelId; // optional
        this.pinIssueCsInfo = builder.pinIssueCsInfo; // optional
        this.imageUrl = builder.imageUrl;  // optional
        this.distType = builder.distType;  // optional
        this.detailInfo = builder.detailInfo; // optional
        this.noticeInfo = builder.noticeInfo; // optional
        this.couponExpiredAt = builder.couponExpiredAt; // optional

    }
    public static void main(String[] args) {

        Item item = new Item.Builder(
                10,
                1000,
                2000,
                "I123",
                "C123",
                "(주)맥도날드",
                "맥도날드",
                101,
                5000,
                3000,
                40,
                5,
                (byte)2,
                365,
                "CS",
                (byte) 3,
                true,
                201,
                true,
                Instant.now(),
                Instant.MAX
        ).noticeInfo("공지")
         .imageUrl("http://builder.jpg")
         .build();
        System.out.println(item);
    }
}