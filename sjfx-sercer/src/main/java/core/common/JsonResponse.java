package core.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *@ClasName JsonResponse
 *@Desciption  通用 json 返回对象
 *@Author zhangfei
 *@Date 2020/5/22 15:55
 **/

@Getter
@Setter
@ToString
@NoArgsConstructor
public class JsonResponse<T> {

    private String msg;   // 返回提示信息

    private int code;     //  HTTP 状态码

    private T data;       //  数据对象

    public JsonResponse(int code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static<T> JsonResponse<T> success(){
        return new JsonResponse(200, "succsss",null);
    }

    public static<T> JsonResponse<T> success(T data){
        return new JsonResponse<>(200, "success",data);
    }

    public static<T> JsonResponse<T> error(int code,String msg,T data){
        return new JsonResponse<>(code,msg,data);
    }

}
