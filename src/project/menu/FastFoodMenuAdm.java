package project.menu;

import project.config.ColorConfig;
import project.config.Config;
import project.view.fastFoodView.FastFoodView;

public class FastFoodMenuAdm {
    public FastFoodMenuAdm() {
        int chooseManu;
        while (true) {
            System.out.println("                                          .-------------------------------------------------------------." + "\n" +
                    "                                          |                   " + ColorConfig.BLUE + "Quản lý thức ăn nhanh " + ColorConfig.RESET + "                     |" + "\n" +
                    "                                          |-------------------------------------------------------------|" + "\n" +
                    "                                          |             1. Thêm mới thức ăn nhanh.                           |" + "\n" +
                    "                                          |             2. Hiện danh sách thức ăn nhanh.                     |" + "\n" +
                    "                                          |             3. Sửa thông tin thức ăn nhanh.                      |" + "\n" +
                    "                                          |             4. Xóa thức ăn nhanh.                                |" + "\n" +
                    "                                          |             5. Xem thức ăn nhanh.                                |" + "\n" +
                    "                                          |             6. " + ColorConfig.RED + "Quay lại Menu Chính" + ColorConfig.RESET + ".                         |" + "\n" +
                    "                                          '-------------------------------------------------------------'");
            System.out.println(ColorConfig.GREEN + ".------------------------------------------------------." + "\n" +
                    "|                                                      |" + ColorConfig.RESET);
            System.out.print(ColorConfig.BLUE_ITALIC + "     Mời chọn số : ➯ " + ColorConfig.RESET);
            chooseManu = Config.getInteger();
            System.out.println(ColorConfig.GREEN + "|                                                      |" + "\n" +
                    "'------------------------------------------------------'" + ColorConfig.RESET);
            if (chooseManu <= 6) {
                break;
            } else {
                System.out.println("Chỉ được chọn từ 1 --> 6 vui lòng chọn lại!");
            }
        }
        switch (chooseManu) {
            case 1:
                new FastFoodView().ceateFastFood();
                break;
            case 2:
                new FastFoodView().showTableFastFood();
                break;
            case 3:
                new FastFoodView().editFastFood();
                break;
            case 4:
                new FastFoodView().deleteFastFood();
                break;
            case 5:
                new FastFoodView().detailFastFood(); // chưa hoàn thành
                break;
            case 6:
                new ProfileMenu();
                break;
        }
    }
}

