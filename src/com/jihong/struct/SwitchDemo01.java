package com.jihong.struct;

public class SwitchDemo01 {
    public static void main(String[] args) {
        String a = "c";
        switch (a) {
            case "a":
                System.out.println("优秀");
                break;
                case "b":
                    System.out.println("良好");
                    break;
                    case "c":
                        System.out.println("及格");
                        break;
                        case "d":
                            System.out.println("再接再厉");
                            break;
                            case "e":
                                System.out.println("挂科");
                                break;
            default:
                    System.out.println(a);


        }
    }
}
