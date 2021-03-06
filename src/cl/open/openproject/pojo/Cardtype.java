package cl.open.openproject.pojo;

// Generated 17-08-2010 12:26:43 PM by Hibernate Tools 3.3.0.GA

/**
 * Cardtype generated by hbm2java
 */
@SuppressWarnings("serial")
public class Cardtype implements java.io.Serializable {

	private Integer cardTypeId;
	private String cardTypeDescription;
	private Integer cardTypeAmount;
	private Float cardTypeCostPerCard;

	public Cardtype() {
	}

	public Cardtype(String cardTypeDescription, Integer cardTypeAmount,
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
