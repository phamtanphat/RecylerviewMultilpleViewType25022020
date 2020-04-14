package com.example.recyclerviewmultipleviewtype25022020;

import java.util.ArrayList;
import java.util.Arrays;

public class FoodModel {
    private String name;
    private int price;
    private String describe;
    private int image;

    public FoodModel(String name, int price, String describe, int image) {
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.image = image;
    }

    public static ArrayList<FoodModel> mock(){
        return new ArrayList<>(Arrays.asList(
                new FoodModel("Bánh khọt",100000,"Bánh khọt là loại bánh Việt Nam (chính xác là loại bánh đặc trưng của miền nam Việt Nam) làm từ bột gạo hoặc bột sắn, có nhân tôm, được chiên và ăn kèm với rau sống, ớt tươi, thường ăn với nước mắm pha ngọt, rất ít khi chấm nước sốt mắm tôm (không phải mắm tôm hay mắm tôm chua)",R.drawable.hinh_mon_banh_khot),
                new FoodModel("Bánh mì",35000,"Bánh mì là món ăn nhanh buổi sáng, buổi tối cho giới học sinh, sinh viên và người lao động vì có giá thành phù hợp. Tuỳ từng địa phương ở Việt Nam mà bánh mì kẹp có thể được sử dụng thay thế cho bữa sáng, hoặc như một món ăn nhanh vào các thời điểm khác nhau trong ngày.",R.drawable.hinh_mon_banh_my),
                new FoodModel("Bí ngòi chiên xù",50000,"Bí ngòi hay bí Nhật Bản là một loài thực vật thuộc chi Bí với tên khoa học Cucurbita pepo. Quả bí ngòi thường được dùng làm một loại rau nấu lên dùng trong",R.drawable.hinh_mon_bi_ngoi_chien_xu),
                new FoodModel("Bún mắm", 60000 ,"Bún mắm là một trong số các món ăn đặc sản của miền tây Nam bộ Việt Nam. Bún mắm có nguồn gốc từ Campuchia, được nấu từ mắm bù hốc. Khi sang đến Việt Nam thường được nấu bằng mắm cá linh hay cá sặc, đây là các loại cá có nhiều tại miền Tây, đặc biệt là các tỉnh Trà Vinh và Sóc Trăng.",R.drawable.hinh_mon_bun_mam ),
                new FoodModel("Bún riêu",25000,"Bún riêu cua là một món ăn truyền thống Việt Nam được biết đến rộng rãi trong nước và quốc tế . Món ăn này gồm bún (bún rối hoặc bún lá) và 'riêu cua'. Riêu cua là canh chua được nấu từ gạch cua, thịt cua giã và lọc cùng với quả dọc, cà chua, mỡ nước, giấm bỗng, nước mắm, muối, hành hoa. Bún riêu thường thêm chút mắm tôm để tăng thêm vị đậm đà, thường ăn kèm với rau sống.",R.drawable.hinh_mon_bun_rieu),
                new FoodModel("Mực teriyaki",75000,"Teriyaki (kanji: 照り焼き; hiragana: てりやき) là một phương pháp nấu ăn được sử dụng trong ẩm thực Nhật Bản, theo đó thức ăn được hun hoặc nướng cùng nước xốt được phết lên thực phẩm, với thành phần nước xốt chủ yếu là nước tương, mirin và đường.",R.drawable.hinh_mon_muc)
        ));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
