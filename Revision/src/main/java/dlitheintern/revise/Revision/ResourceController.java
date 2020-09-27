package dlitheintern.revise.Revision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResourceController 
{
	@Autowired
	ResourceService service;
	
	@RequestMapping(value="/hai")
	public ModelAndView one()
	{
		return new ModelAndView("sample");
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView letAdd()
	{
		return new ModelAndView("create");
	}
	
	@RequestMapping(value="/added",method=RequestMethod.POST)
	public ModelAndView inserted(Resource res)
	{
		return new ModelAndView("create").addObject("msg", service.add(res).getName()+" has added");
	}
}
