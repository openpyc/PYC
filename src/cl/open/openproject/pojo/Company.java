package cl.open.openproject.pojo;

//TODO Revisada

@SuppressWarnings("serial")
public class Company implements java.io.Serializable {

	private Integer companyId;
	private Integer idCreditCard;
	private Integer stateCountryId;
	private String companyPaymentAddress1;
	private Integer companyFlagOffer;
	private Float companyAvailableBalance;
	private Float companyAutomaticAmount;
	private String companyName;

	public Company() {
	}

	public Company(Integer idCreditCard, Integer stateCountryId) {
		this.idCreditCard = idCreditCard;
		this.stateCountryId = stateCountryId;
	}

	public Company(Integer idCreditCard, Integer stateCountryId,
			String companyPaymentAddress1, Integer companyFlagOffer,
			Float companyAvailableBalance, Float companyAutomaticAmount,
			String companyName) {
		this.idCreditCard = idCreditCard;
		this.stateCountryId = stateCountryId;
		this.companyPaymentAddress1 = companyPaymentAddress1;
		this.companyFlagOffer = companyFlagOffer;
		this.companyAvailableBalance = companyAvailableBalance;
		this.companyAutomaticAmount = companyAutomaticAmount;
		this.companyName = companyName;
	}

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getIdCreditCard() {
		return this.idCreditCard;
	}

	public void setIdCreditCard(Integer idCreditCard) {
		this.idCreditCard = idCreditCard;
	}

	public Integer getStateCountryId() {
		return this.stateCountryId;
	}

	public void setStateCountryId(Integer stateCountryId) {
		this.stateCountryId = stateCountryId;
	}

	public String getCompanyPaymentAddress1() {
		return this.companyPaymentAddress1;
	}

	public void setCompanyPaymentAddress1(String companyPaymentAddress1) {
		this.companyPaymentAddress1 = companyPaymentAddress1;
	}

	public Integer getCompanyFlagOffer() {
		return this.companyFlagOffer;
	}

	public void setCompanyFlagOffer(Integer companyFlagOffer) {
		this.companyFlagOffer = companyFlagOffer;
	}

	public Float getCompanyAvailableBalance() {
		return this.companyAvailableBalance;
	}

	public void setCompanyAvailableBalance(Float companyAvailableBalance) {
		this.companyAvailableBalance = companyAvailableBalance;
	}

	public Float getCompanyAutomaticAmount() {
		return this.companyAutomaticAmount;
	}

	public void setCompanyAutomaticAmount(Float companyAutomaticAmount) {
		this.companyAutomaticAmount = companyAutomaticAmount;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
