package in.hocg.defaults.base;

import in.hocg.defaults.Custom;
import in.hocg.defaults.utils.LangKit;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * (๑`灬´๑)
 *
 * @author hocgin(admin@hocg.in)
 *         <p>
 *         <p>
 *         <p>
 *         --------------------
 *         Created 16-8-26.
 */
public abstract class BaseController {

    public String redirectJump(HttpServletRequest request, String def) throws IOException {
        return String.format("redirect:%s", LangKit.ifNull(request.getParameter(Custom.RequestParams.JUMP), def));
    }
}
