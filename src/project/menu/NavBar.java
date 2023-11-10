package project.menu;

import project.config.ColorConfig;
import project.config.Config;
import project.controller.UserController;
import project.model.User;
import project.view.fastFoodView.FastFoodView;
import project.view.userView.UserView;


public class NavBar {
    UserController userController = new UserController();

    public NavBar() {
        User user = userController.getUserLogin();

        if (user != null) {
            System.out.println(
                    "                                              .————————————————————————————————————————————————————————————————.\n" +
                            "                                                            \uD83E\uDD80\uD83E\uDD80     WELCOME  " + ColorConfig.BLUE + user.getName() + ColorConfig.RESET + "    \uD83E\uDD80\uD83E\uDD80                    \n" +
                            "                                              '————————————————————————————————————————————————————————————————'\n");
            new ProfileMenu();
        } else {
            System.out.println(
                    "                                              .————————————————————————————————————————————————————————————————.\n" +
                            "                                              ║              " + ColorConfig.BLUE_ITALIC + "\uD83E\uDD80\uD83E\uDD80" + "CUA Restaurant" + "\uD83E\uDD80\uD83E\uDD80" + ColorConfig.RESET + "                ║\n" +
                            "                                              ║----------------------------------------------------------------║\n" +
                            "                                              ║                  1. Đăng Ký.                                   ║\n" +
                            "                                              ║                  2. Đăng Nhập.                                 ║\n" +
                            "                                              ║                  3. Danh sách sản phẩm.                        ║\n" +
                            "                                              ║                  4. Tìm kiếm sản phẩm.                         ║\n" +
                            "                                              ║                  5. Top 10 sản phẩm có like nhiều nhất.        ║\n" +
                            "                                              ║                  6. " + ColorConfig.RED + "Thoát chương trình" + ColorConfig.RESET + ".                        ║\n" +
                            "                                              '————————————————————————————————————————————————————————————————'\n")
            ;
            int choose;
            while (true) {
                do {
                    System.out.println(".------------------------------------------------------.");
                    System.out.println("|                                                      |");
                    System.out.print("     Mời chọn số: ");
                    choose = Config.getInteger();
                    System.out.println("|                                                      |");
                    System.out.println("'------------------------------------------------------'\n");
                    if (choose > 7) {
                        System.out.println("          Nhập quá " + ColorConfig.RED + "6 " + ColorConfig.RESET + "rồi bạn ơi !!!\uD83E\uDD10\uD83E\uDD10\uD83E\uDD10");
                    }
                } while (choose > 6);
                switch (choose) {
                    case 1:
                        new UserView().formRegister();
                        break;
                    case 2:
                        new UserView().formLogin();
                        break;
                    case 3:
                        new FastFoodView().showTableFastFood();
                        break;
                    case 4:
                        new FastFoodView().searchFastFood();  // ok
                        break;
                    case 5:
                        new FastFoodView().topLike();  // ok
                        break;
                    case 6:
                        System.out.println(ColorConfig.BLUE + "                                    \uD83D\uDC93\uD83D\uDC93\uD83D\uDC93Cảm ơn đã sử dụng dịch vụ của chúng tôi chúc bạn có một ngày mới vui vẻ!!! \uD83D\uDC93\uD83D\uDC93\uD83D\uDC93" + ColorConfig.RESET);
                        System.exit(0);
                    default:
                        System.out.println("Có từ " + ColorConfig.RED + "1 " + ColorConfig.RESET + "-----> " + ColorConfig.RED + "7 " + ColorConfig.RESET + "Quý khách vui lòng chọn lại !!!\uD83D\uDE14\uD83D\uDE14\uD83D\uDE14");
                }
            }

        }

    }
}
