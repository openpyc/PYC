package cl.open.openproject.language.action;

import org.apache.struts.action.*;
//import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author      : Jorge Cespedes Stevenson
 * @since       : JDK 1.5_06
 * @version     : 1.0
 * Date         : 30-01-2008
 * Time         : 05:31:55 PM
 * Description  : Action in charge to update locate of request Object
 *              Locate is part of the attributes of a consultation http and, therefore, stored during navigation.
 *              The JVM load all bundles in the moment to run. Therefore, all the defined languages are accessible.
 *              For examples, three link:
 *                  <html:link page='/switch.do?lang=fr&cty=FR'>FR</html:link>
 *                  <html:link page='/switch.do?lang=en&cty=EN'>EN</html:link>
 *                  <html:link page='/switch.do?lang=es&cty=ES'>ES</html:link>
 *              This link's relate a class Action "SwitchAction" define in the mapping file. el alias "switch".
 */
public class SwitchLanguageAction extends Action  {
    //static Logger logger = Logger.getLogger(SwitchLanguageAction.class);

    /**
     *
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     */
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {
        ActionForward forward = null;
        // get page's parameter and url of referer Header
        String country = request.getParameter("cty");
        String language = request.getParameter("lang");
        String referer = request.getHeader("referer");
        //logger.debug("referer: " + referer);
        // set locale
        if (country != null && language != null)
            this.setLocale( request, new Locale( language, country ) );

        forward = new RedirectingActionForward();
        forward.setPath( referer );
        return forward;
    }
}