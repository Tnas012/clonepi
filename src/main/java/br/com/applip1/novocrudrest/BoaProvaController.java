package br.com.applip1.novocrudrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller  
public class BoaProvaController {
  
	@GetMapping("/votos")
    @ResponseBody
    public String responderVotos() 
	{
        return "Boa Prova:-)";
    }
}

