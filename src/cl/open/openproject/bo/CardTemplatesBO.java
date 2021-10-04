package cl.open.openproject.bo;


import java.util.ArrayList;

import java.util.List;

import cl.open.openproject.bean.CardtemplatesBean;
import cl.open.openproject.dao.CardTemplatesDAO;
import cl.open.openproject.interfaces.ApplicationMessage;
import cl.open.openproject.pojo.Cardtemplates;


public class CardTemplatesBO implements ApplicationMessage{
	
	
	public List<CardtemplatesBean> SearchCardTemplates(Integer userID){
		CardTemplatesDAO cardTemplatesDao = new CardTemplatesDAO();		
		
		List<Cardtemplates> lstCardTemplates ;
		
		if (userID ==1)
			lstCardTemplates = cardTemplatesDao.FindTemplatesUser(userID);
		else
			lstCardTemplates = cardTemplatesDao.FindTemplatesall(userID);
		List<CardtemplatesBean> lstCardtemplatesBeans = new ArrayList<CardtemplatesBean>();
		
		if(lstCardTemplates != null && lstCardTemplates.size() > 0)
		{
			for(int i = 0; i < lstCardTemplates.size(); i++)
			{
				Cardtemplates cardtemplates = lstCardTemplates.get(i);
				CardtemplatesBean cardtemplatesBean = new CardtemplatesBean();
				
				cardtemplatesBean.setCardTemplatesDate(cardtemplates.getCardTemplatesDate());
				cardtemplatesBean.setCardTemplatesHeight(cardtemplates.getCardTemplatesHeight());
				cardtemplatesBean.setCardTemplatesId(cardtemplates.getCardTemplatesId());
				cardtemplatesBean.setCardTemplatesName(cardtemplates.getCardTemplatesName());
				cardtemplatesBean.setCardTemplatesOrientation(cardtemplates.getCardTemplatesOrientation());
				cardtemplatesBean.setCardTemplatesPreview(cardtemplates.getCardTemplatesPreview());
				cardtemplatesBean.setCardTemplatesState(cardtemplates.getCardTemplatesState());
				cardtemplatesBean.setCardTemplatesWidth(cardtemplates.getCardTemplatesWidth());
				cardtemplatesBean.setCardTypeId(cardtemplates.getCardTypeId());
				cardtemplatesBean.setCustomerId(cardtemplates.getCustomerId());
				
				lstCardtemplatesBeans.add(cardtemplatesBean);
			}
		}
		
		return lstCardtemplatesBeans;		
	}
	
	public String FindTemplates(Integer cardTypeId,Integer User){
		CardTemplatesDAO cardTemplatesDAO = new CardTemplatesDAO();
		String templates = "" ; 
		//get card template by card type and user
		List<Cardtemplates> lstTemplates = cardTemplatesDAO.FindTemplatesByCardType(cardTypeId,User);
		for(int i = 0; i < lstTemplates.size(); i++){
			Cardtemplates cardtemplates = lstTemplates.get(i);
			if(i == 0){
				templates = templates + cardtemplates.getCardTemplatesName() + ";" + cardtemplates.getCardTemplatesId() + ";"+cardtemplates.getCardTemplatesOrientation();
			}else{
				templates = templates + "||" + cardtemplates.getCardTemplatesName() + ";" + cardtemplates.getCardTemplatesId() + ";" + cardtemplates.getCardTemplatesOrientation();
			}
		}
		return templates;
	}
	
	
	
  
  
}