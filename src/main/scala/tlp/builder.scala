package tlp

import java.time.Instant

/**
  * Created by ikhoon on 24/08/2017.
  */
object PhantomTypeBuilder {

  sealed trait Bool
  trait True extends Bool
  trait False extends Bool

  sealed trait BuildState {
    type Id <: Bool
    type BrandId <: Bool
    type CatalogId <: Bool
    type SupplyChannelItemCode <: Bool
    type SupplyChannelCategoryCode <: Bool
    type Name <: Bool
    type DisplayName <: Bool
    type ItemType <: Bool
    type BasicPrice <: Bool
    type SellingPrice <: Bool
    type DiscountRate <: Bool
    type FeeRate <: Bool
    type PeriodType <: Bool
    type ValidPeriod <: Bool
    type PinIssueType <: Bool
    type IsCancelable <: Bool
    type Status <: Bool
    type DisplayYn <: Bool
    type ReleasedAt <: Bool
    type ExpiredAt <: Bool
  }

  case class Item(
    id:                          Int,
    brandId:                     Int,
    catalogId:                   Int,
    supplyChannelId:             Option[Int],
    supplyChannelItemCode:       String,
    supplyChannelCategoryCode:   String,
    name:                        String,
    displayName:                 String,
    itemType:                    Int,
    basicPrice:                  Int,
    sellingPrice:                Int,
    discountRate:                Int,
    feeRate:                     Int,
    periodType:                  Byte,
    validPeriod:                 Int,
    pinIssueType:                Byte,
    pinIssueCsInfo:              Option[String],
    isCancelable:                Boolean,
    imageUrl:                    Option[String],
    status:                      Int,
    displayYn:                   Boolean,
    distType:                    Option[Short],
    detailInfo:                  Option[String],
    noticeInfo:                  Option[String],
    couponExpiredAt:             Option[Instant],
    releasedAt:                  Instant,
    expiredAt:                   Instant
  )

  class Builder[B <: BuildState] { self =>
    private var id:                          Option[Int] = None
    private var brandId:                     Option[Int] = None
    private var catalogId:                   Option[Int] = None
    private var supplyChannelId:             Option[Int] = None  // optional
    private var supplyChannelItemCode:       Option[String] = None
    private var supplyChannelCategoryCode:   Option[String] = None
    private var name:                        Option[String] = None
    private var displayName:                 Option[String] = None
    private var itemType:                    Option[Int] = None
    private var basicPrice:                  Option[Int] = None
    private var sellingPrice:                Option[Int] = None
    private var discountRate:                Option[Int] = None
    private var feeRate:                     Option[Int] = None
    private var periodType:                  Option[Byte] = None
    private var validPeriod:                 Option[Int] = None
    private var pinIssueType:                Option[Byte] = None
    private var pinIssueCsInfo:              Option[String] = None  // optional
    private var isCancelable:                Option[Boolean] = None
    private var imageUrl:                    Option[String] = None  // optional
    private var status:                      Option[Int] = None
    private var displayYn:                   Option[Boolean] = None
    private var distType:                    Option[Short] = None   // optional
    private var detailInfo:                  Option[String] = None  // optional
    private var noticeInfo:                  Option[String] = None  // optional
    private var couponExpiredAt:             Option[Instant] = None // optional
    private var releasedAt:                  Option[Instant] = None
    private var expiredAt:                   Option[Instant] = None

    def newBuilder[C <: BuildState] = this.asInstanceOf[Builder[C]]

    def withId(id: Int) = {
      self.id = Some(id)
      newBuilder[B { type Id = True }]
    }

    def withBrandId(brandId: Int) = {
      self.brandId = Some(brandId)
      newBuilder[B { type BrandId = True }]
    }
    def withCatalogId(catalogId: Int) = {
      self.catalogId = Some(catalogId)
      newBuilder[B {type CatalogId = True}]
    }
    def withSupplyChannelId(supplyChannelId: Int) = {
      self.supplyChannelId = Some(supplyChannelId)
      newBuilder[B]
    }
    def withSupplyChannelItemCode(supplyChannelItemCode: String) = {
      self.supplyChannelItemCode = Some(supplyChannelItemCode)
      newBuilder[B {type SupplyChannelItemCode = True}]
    }
    def withSupplyChannelCategoryCode(supplyChannelCategoryCode: String) = {
      self.supplyChannelCategoryCode = Some(supplyChannelCategoryCode)
      newBuilder[B {type SupplyChannelCategoryCode = True}]
    }

    def withName(name: String) = {
      self.name = Some(name)
      newBuilder[B {type Name = True}]
    }
    def withDisplayName(displayName: String) = {
      self.displayName = Some(displayName)
      newBuilder[B {type DisplayName = True}]
    }
    def withItemType(itemType: Int) = {
      self.itemType = Some(itemType)
      newBuilder[B {type ItemType = True}]
    }
    def withBasicPrice(basicPrice: Int) = {
      self.basicPrice = Some(basicPrice)
      newBuilder[B {type BasicPrice = True}]
    }
    def withSellingPrice(sellingPrice: Int) = {
      self.sellingPrice = Some(sellingPrice)
      newBuilder[B {type SellingPrice = True}]
    }

    def withDiscountRate(discountRate: Int) = {
      self.discountRate = Some(discountRate)
      newBuilder[B {type DiscountRate = True}]
    }
    def withFeeRate(feeRate: Int) = {
      self.feeRate = Some(feeRate)
      newBuilder[B {type FeeRate = True}]
    }
    def withPeriodType(periodType: Byte) = {
      self.periodType = Some(periodType)
      newBuilder[B {type PeriodType = True}]
    }
    def withValidPeriod(validPeriod: Int) = {
      self.validPeriod = Some(validPeriod)
      newBuilder[B {type ValidPeriod = True}]
    }
    def withPinIssueType(pinIssueType: Byte) = {
      self.pinIssueType = Some(pinIssueType)
      newBuilder[B {type PinIssueType = True}]
    }
    def withPinIssueCsInfo(pinIssueCsInfo: String) = {
      self.pinIssueCsInfo = Some(pinIssueCsInfo)
      newBuilder[B]
    }
    def withIsCancelable(isCancelable: Boolean) = {
      self.isCancelable = Some(isCancelable)
      newBuilder[B {type IsCancelable = True}]
    }
    def withImageUrl(imageUrl: String) = {
      self.imageUrl = Some(imageUrl)
      newBuilder[B]
    }
    def withStatus(status: Int) = {
      self.status = Some(status)
      newBuilder[B {type Status = True}]
    }
    def withDisplayYn(displayYn: Boolean) = {
      self.displayYn = Some(displayYn)
      newBuilder[B {type DisplayYn = True}]
    }
    def withDistType(distType: Short) = {
      self.distType = Some(distType)
      newBuilder[B]
    }
    def withDetailInfo(detailInfo: String) = {
      self.detailInfo = Some(detailInfo)
      newBuilder[B]
    }
    def withNoticeInfo(noticeInfo: String) = {
      self.noticeInfo = Some(noticeInfo)
      newBuilder[B]
    }
    def withCouponExpiredAt(couponExpiredAt: Instant) = {
      self.couponExpiredAt = Some(couponExpiredAt)
      newBuilder[B]
    }
    def withReleasedAt(releasedAt: Instant) = {
      self.releasedAt = Some(releasedAt)
      newBuilder[B {type ReleasedAt = True}]
    }
    def withExpiredAt(expiredAt: Instant) = {
      self.expiredAt = Some(expiredAt)
      newBuilder[B {type ExpiredAt = True}]
    }


    def build(implicit
      ev1: B#Id =:= True,
      ev2: B#BrandId =:= True,
      ev3: B#CatalogId =:= True,
      ev4: B#SupplyChannelItemCode =:= True,
      ev5: B#SupplyChannelCategoryCode =:= True,
      ev6: B#Name =:= True,
      ev7: B#DisplayName =:= True,
      ev8: B#ItemType =:= True,
      ev9: B#BasicPrice =:= True,
      ev10: B#SellingPrice =:= True,
      ev11: B#DiscountRate =:= True,
      ev12: B#FeeRate =:= True,
      ev13: B#PeriodType =:= True,
      ev14: B#ValidPeriod =:= True,
      ev15: B#PinIssueType =:= True,
      ev16: B#IsCancelable =:= True,
      ev17: B#Status =:= True,
      ev18: B#DisplayYn =:= True,
      ev19: B#ReleasedAt =:= True,
      ev20: B#ExpiredAt =:= True
    ): Item = {
      Item(id.get, brandId.get, catalogId.get, supplyChannelId, supplyChannelItemCode.get, supplyChannelCategoryCode.get, name.get, displayName.get, itemType.get, basicPrice.get, sellingPrice.get, discountRate.get, feeRate.get, periodType.get, validPeriod.get, pinIssueType.get, pinIssueCsInfo, isCancelable.get, imageUrl, status.get, displayYn.get, distType, detailInfo, noticeInfo, couponExpiredAt, releasedAt.get, expiredAt.get
        )
    }
  }

  object Builder {
    def apply() = new Builder[BuildState {}]
  }

//  Builder().build
//  Builder().withPrice(4500).build

  /*
  var id:                          Option[Int] = None
  var brandId:                     Option[Int] = None
  var catalogId:                   Option[Int] = None
  var supplyChannelId:             Option[Int] = None  // optional
  var supplyChannelItemCode:       Option[String] = None
  var supplyChannelCategoryCode:   Option[String] = None
  var name:                        Option[String] = None
  var displayName:                 Option[String] = None
  var itemType:                    Option[Int] = None
  var basicPrice:                  Option[Int] = None
  var sellingPrice:                Option[Int] = None
  var discountRate:                Option[Int] = None
  var feeRate:                     Option[Int] = None
  var periodType:                  Option[Byte] = None
  var validPeriod:                 Option[Int] = None
  var pinIssueType:                Option[Byte] = None
  var pinIssueCsInfo:              Option[String] = None  // optional
  var isCancelable:                Option[Boolean] = None
  var imageUrl:                    Option[String] = None  // optional
  var status:                      Option[Int] = None
  var displayYn:                   Option[Boolean] = None
  var distType:                    Option[Short] = None   // optional
  var detailInfo:                  Option[String] = None  // optional
  var noticeInfo:                  Option[String] = None  // optional
  var couponExpiredAt:             Option[Instant] = None // optional
  var releasedAt:                  Option[Instant] = None
  var expiredAt:                   Option[Instant] = None
  */
  def main(args: Array[String]): Unit = {

    val now = Instant.now()

    val item = Builder()
        .withId(10)
        .withBrandId(1000)
        .withCatalogId(2000)
        .withSupplyChannelItemCode("I123")
        .withSupplyChannelCategoryCode("C123")
        .withName("(주)맥도날드")
        .withDisplayName("맥도날드")
        .withItemType(101)
        .withBasicPrice(5000)
        .withSellingPrice(3000)
        .withDiscountRate(40)
        .withFeeRate(5)
        .withPeriodType(2)
        .withValidPeriod(365)
        .withPinIssueType(3)
        .withIsCancelable(true)
        .withStatus(201)
        .withDisplayYn(true)
        .withReleasedAt(now)
        .withExpiredAt(Instant.MAX)
      .build

    println(item)
    val item2 = Item(
      id = 10,
      brandId = 1000,
      catalogId = 2000,
      supplyChannelId = None,
      supplyChannelItemCode = "I123",
      supplyChannelCategoryCode = "C123",
      name = "(주)맥도날드",
      displayName = "맥도날드",
      itemType = 101,
      basicPrice = 5000,
      sellingPrice = 3000,
      discountRate = 40,
      feeRate = 5,
      periodType = 2,
      validPeriod = 365,
      pinIssueType = 3,
      pinIssueCsInfo = None,
      isCancelable = true,
      imageUrl = None,
      status = 201,
      displayYn = true,
      distType = None,
      detailInfo = None,
      noticeInfo = None,
      couponExpiredAt = None,
      releasedAt = now,
      expiredAt = Instant.MAX
    )

    println(item2)
    assert(item == item2)

  }


  // that one compile
}