package business.web;


import core.common.JsonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClasName RrController
 *@Desciption 数据收集
 *@Author 91994
 *@Date 2020/5/22 16:25
 **/
@RestController
@RequestMapping("/api/rr/collect")
public class RrController {

    @GetMapping("detail")
    public JsonResponse detail(String name,String password){

        return JsonResponse.success("请求成功" + name + "----" + password);
    }
}
