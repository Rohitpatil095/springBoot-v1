package com.db.day04.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.db.day04.auth.authService;
import com.db.day04.data.dummyUsers;
import com.db.day04.entity.toDoEntity;

import jakarta.validation.Valid;

@Controller
@SessionAttributes({"name","error"})
public class loginController {

	@Autowired
	private authService auth;
	
	private Logger logger =LoggerFactory.getLogger(getClass()); 
	
	private static List<toDoEntity> todo= new ArrayList<>();
	static
	{
				todo.add(new toDoEntity(1,"caren","",LocalDate.now().plusYears(1),true));
				todo.add(new toDoEntity(2,"das","",LocalDate.now().plusYears(2),false));
				todo.add(new toDoEntity(3,"rachit","",LocalDate.now().plusYears(3),true));
				todo.add(new toDoEntity(4,"fet","",LocalDate.now().plusYears(4),false));
				todo.add(new toDoEntity(5,"root","",LocalDate.now().plusYears(5),false));
	}
	
	public loginController addToDoListItem(int id,String uName,String description, LocalDate date, boolean isDone) {
		todo.add(new toDoEntity(id,uName,description,date,isDone));
		return null;
	}
	
	public boolean deleteUser(int id)
	{
//		?Use predicate to remove check
//		Predicate<Integer> checkExistance= i-> (users.get(id)) ;
//		users.remove(users.get(id));
		
		for(toDoEntity user:todo)
		{
			if(user.getId()==id)
			{
				todo.remove(user);
				return true;
			}
		}
		return false;
		
	}	
	
	public toDoEntity getUserById(int id)
	{
		for(toDoEntity td:todo)
		{
			if(td.getId()==id)
			{
				return td;
			}
		}
		return new toDoEntity();
	}
	
//	public void updateUserById(int id,String uName,String desc, boolean done)
//	{
//		toDoEntity td= new loginController().getUserById(id);
//		td.setId(id);
//		td.setDescription(desc);
//		td.setDone(done);
//		td.setUserName(uName);
//		
//	}
	
	
	public List<toDoEntity> getUserByName(String name)
	{	
//		for(toDoEntity todoList:todo)
//		{
//			if(name.equals(todoList.getUserName()))
//			{
//				return todoList;
//			}
//		}
//		return new toDoEntity();
		return todo;
	}
	
	public loginController() {
		super();
	}

	@RequestMapping("/")
	public String home()
	{
		return "redirect:login";
	}
	
	@RequestMapping(value="login",method =RequestMethod.GET)
	public String userLogin()
	{
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String welcomePage(@RequestParam String uName,@RequestParam String pass ,ModelMap model)
	{
		if(auth.isAuthenticatedUser(uName, pass))
		{			
			model.put("name",uName);
			model.put("password", pass);
		
			return "welcomeTodo";
		}
		else
		{
			model.put("errMessage", "Login Credentials Are Invalid...");
			return "login";
		}
		
		
		// Generic way
//		if(uName.equals("rp@gmail.com") && pass.equals("root"))
//		{
//			return "welcome";
//		}
//		else
//		{
//			return "loginError";
//		}
	}
	
	@RequestMapping("/userTodoList")
	public String userTodos(ModelMap model)
	{
		model.put("userList",new loginController().getUserByName("rachit"));
		return "userTodoList";
	}
	
// ---- Normal Way binding data
//	@RequestMapping(value="/add-todo", method = RequestMethod.GET)
//	public String addItemInToDo()
//	{
//		return "add-todo";
//	}

//	@RequestMapping(value="/add-todo", method = RequestMethod.POST)
//	public String displayItems(@RequestParam int id, @RequestParam String userName, @RequestParam boolean isDoneStatus, ModelMap model)
//	{	
////		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
////		formatter = formatter.withLocale( Locale.US );  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
////		LocalDate formattedDate = LocalDate.parse(date, formatter);
//		
//		
//		loginController m=new loginController().addToDoListItem(id,userName,LocalDate.now().plusYears(1),isDoneStatus);
//		return "redirect:userTodoList";
//	}

// Adding data validation and binding direct to toDoEntity

	@RequestMapping(value="/add-todo", method = RequestMethod.GET)
	public String addItemInToDo(ModelMap model)
	{
		toDoEntity td= new toDoEntity(0,(String)model.get("name"),"",LocalDate.now().plusYears(1),false);
		model.addAttribute("td",td);
//		model.put("td", td);
		return "todo";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.POST)
	public String displayItems(ModelMap model, @Valid toDoEntity td, BindingResult result)
	{	
		if(result.hasErrors())
		{
//			model.put("error", result);
			return "redirect:add-todo";
		}
		
		loginController custTodo=new loginController().addToDoListItem(td.getId(),(String)model.get("name"),td.getDescription(),td.getTargetLocalDate(),td.isDone());
		model.put("td",custTodo);		
		return "redirect:userTodoList";
	}
	
	@RequestMapping("/loginUser")
	public String loginUser(@RequestParam String name, ModelMap model)
	{
		logger.debug("Started loginUser request");
		model.put("userName", name);
		logger.warn("Added model and value init....");
		return "loginUser";
	}
	
	@RequestMapping("/delete-todo")
	public String deleteTodoEntry(@RequestParam int id)
	{
		boolean isEntryRemoved= new loginController().deleteUser(id);
		
		return "redirect:userTodoList";
		
//		if(isEntryRemoved)
//		{
//			return "";
//		}
//		return ""
		
	}
	
	@RequestMapping(value="/update-todo", method =RequestMethod.GET)
	public String updateTodoList(@RequestParam int id, ModelMap model)
	{
		toDoEntity td= new loginController().getUserById(id);
		model.put("td", td);
		return "todo";
	}

	@RequestMapping(value="/update-todo", method = RequestMethod.POST)
	public String showUpdateTodoList(ModelMap model, toDoEntity td)
	{
		for(toDoEntity t: todo)
		{
			if(t.getId()==td.getId())
			{
				t.setId(td.getId());
				t.setDescription(td.getDescription());
				t.setUserName(td.getUserName());
				t.setTargetLocalDate(td.getTargetLocalDate());
				t.setDone(td.isDone());
				break;
			}
		}
		return "redirect:userTodoList";
	}
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "welcome";
	}
	
}	
