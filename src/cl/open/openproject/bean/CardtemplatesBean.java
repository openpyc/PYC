package cl.open.openproject.bean;

import java.util.Date;

public class CardtemplatesBean{

	private Integer cardTemplatesId;
	private Long customerId;
	private Integer cardTypeId;
	private Date cardTemplatesDate;
	private Integer cardTemplatesState;
	private Integer cardTemplatesWidth;
	private Integer cardTemplatesHeight;
	private String cardTemplatesOrientation;
	private byte[] cardTemplatesPreview;
	private String cardTemplatesName;

	public CardtemplatesBean() {
	}

	public CardtemplatesBean(Integer cardTypeId, String cardTemplatesName) {
		this.cardTypeId = cardTypeId;
		this.cardTemplatesName = cardTemplatesName;
	}

	public CardtemplatesBean(Long customerId, Integer cardTypeId,
			Date cardTemplatesDate, Integer cardTemplatesState,
			Integer cardTemplatesWidth, Integer cardTemplatesHeight,
			String cardTemplatesOrientation,
			byte[] cardTemplatesPreview,
			String cardTemplatesName) {
		this.customerId = customerId;
		this.cardTypeId = cardTypeId;
		this.cardTemplatesDate = cardTemplatesDate;
		this.cardTemplatesState = cardTemplatesState;
		this.cardTemplatesWidth = cardTemplatesWidth;
		this.cardTemplatesHeight = cardTemplatesHeight;
		this.cardTemplatesOrientation = cardTemplatesOrientation;		
		this.cardTemplatesPreview = cardTemplatesPreview;
		this.cardTemplatesName = cardTemplatesName;
	}

	public Integer getCardTemplatesId() {
		return this.cardTemplatesId;
	}

	public void setCardTemplatesId(Integer cardTemplatesId) {
		this.cardTemplatesId = cardTemplatesId;
	}

	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Integer getCardTypeId() {
		return this.cardTypeId;
	}

	public void setCardTypeId(Integer cardTypeId) {
		this.cardTypeId = cardTypeId;
	}

	public Date getCardTemplatesDate() {
		return this.cardTemplatesDate;
	}

	public void setCardTemplatesDate(Date cardTemplatesDate) {
		this.cardTemplatesDate = cardTemplatesDate;
	}

	public Integer getCardTemplatesState() {
		return this.cardTemplatesState;
	}

	public void setCardTemplatesState(Integer cardTemplatesState) {
		this.cardTemplatesState = cardTemplatesState;
	}

	public Integer getCardTemplatesWidth() {
		return this.cardTemplatesWidth;
	}

	public void setCardTemplatesWidth(Integer cardTemplatesWidth) {
		this.cardTemplatesWidth = cardTemplatesWidth;
	}

	public Integer getCardTemplatesHeight() {
		return this.cardTemplatesHeight;
	}

	public void setCardTemplatesHeight(Integer cardTemplatesHeight) {
		this.cardTemplatesHeight = cardTemplatesHeight;
	}

	public String getCardTemplatesOrientation() {
		return this.cardTemplatesOrientation;
	}

	public void setCardTemplatesOrientation(String cardTemplatesOrientation) {
		this.cardTemplatesOrientation = cardTemplatesOrientation;
	}
	
	public byte[] getCardTemplatesPreview() {
		return cardTemplatesPreview;
	}

	public void setCardTemplatesPreview(byte[] cardTemplatesPreview) {
		this.cardTemplatesPreview = cardTemplatesPreview;
	}

	public String getCardTemplatesName() {
		return this.cardTemplatesName;
	}

	public void setCardTemplatesName(String cardTemplatesName) {
		this.cardTemplatesName = cardTemplatesName;
	}

}
