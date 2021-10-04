package cl.open.openproject.bean;

public class CardtypeBean{

	private Integer cardTypeId;
	private String cardTypeDescription;
	private Integer cardTypeAmount;
	private Float cardTypeCostPerCard;

	public CardtypeBean() {
	}

	public CardtypeBean(String cardTypeDescription, Integer cardTypeAmount,
			Float cardTypeCostPerCard) {
		this.cardTypeDescription = cardTypeDescription;
		this.cardTypeAmount = cardTypeAmount;
		this.cardTypeCostPerCard = cardTypeCostPerCard;
	}

	public Integer getCardTypeId() {
		return this.cardTypeId;
	}

	public void setCardTypeId(Integer cardTypeId) {
		this.cardTypeId = cardTypeId;
	}

	public String getCardTypeDescription() {
		return this.cardTypeDescription;
	}

	public void setCardTypeDescription(String cardTypeDescription) {
		this.cardTypeDescription = cardTypeDescription;
	}

	public Integer getCardTypeAmount() {
		return this.cardTypeAmount;
	}

	public void setCardTypeAmount(Integer cardTypeAmount) {
		this.cardTypeAmount = cardTypeAmount;
	}

	public Float getCardTypeCostPerCard() {
		return this.cardTypeCostPerCard;
	}

	public void setCardTypeCostPerCard(Float cardTypeCostPerCard) {
		this.cardTypeCostPerCard = cardTypeCostPerCard;
	}

}
