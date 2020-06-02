package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @GetMapping("/")
    ModelAndView getIndex(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @GetMapping("/calculator")
    public ModelAndView getResult (ModelAndView modelAndView,
                                   @RequestParam("opr_1") float opr_1,
                                   @RequestParam("opr_2") float opr_2,
                                   @RequestParam("operator") String operator){
        float result = 0;
        String message = "Tính thành công";
        switch (operator) {
            case "Addition(+)":
                result = opr_1 + opr_2;
                break;
            case "Subtraction(-)":
                result = opr_1 - opr_2;
                break;
            case "Multiplication(X)":
                result = opr_1 * opr_2;
                break;
            case "Division(/)":
                if (opr_2 == 0){
                    message = "Không thể chia cho 0";
                    break;
                } else {
                    result = opr_1 / opr_2;
                    break;
                }
        }
        modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", message);
        modelAndView.addObject("result", result);
        return modelAndView;
    }

}
