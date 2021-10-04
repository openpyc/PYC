package cl.open.openproject.bo;

import java.util.ArrayList;
import java.util.List;

import cl.open.openproject.bean.CardtypeBean;
import cl.open.openproject.dao.CardTypeDAO;
import cl.open.openproject.interfaces.ApplicationMessage;
import cl.open.openproject.pojo.Cardtype;


public class CardTypeBO implements ApplicationMessage{
	
	public List<CardtypeBean> SearchCardTypes(Integer RolID){
		CardTypeDAO cardTypeDao = new CardTypeDAO();		
		
		List<Cardtype> cardTypes = cardTypeDao.FindCardTypes(RolID,RolID);
		List<CardtypeBean> lstCardTypes = new ArrayList<CardtypeBean>();
		
		if(cardTypes != null && cardTypes.size() > 0)
		{
			for(int i = 0; i < cardTypes.size(); i++)
			{
				Cardtype cardtype = cardTypes.get(i);
				CardtypeBean cardtypeBean = new CardtypeBean();
				cardtypeBean.setCardTypeAmount(cardtype.getCardTypeAmount());
				cardtypeBean.setCardTypeCostPerCard(cardtype.getCardTypeCostPerCard());
				cardtypeBean.setCardTypeDescription(cardtype.getCardTypeDescription());
				cardtypeBean.setCardTypeId(cardtype.getCardTypeId());
				lstCardTypes.add(cardtypeBean);
			}
		}
		return lstCardTypes;
	}
	
	public List<Cardtype> SearchCardTypesfromCardTemplatesId(Integer CardTemplatesId){
		CardTypeDAO cardTypeDao = new CardTypeDAO();		
		
		List<Cardtype> cardTypes = cardTypeDao.FindCardTypes(CardTemplatesId);		
		return cardTypes;		
	}
}