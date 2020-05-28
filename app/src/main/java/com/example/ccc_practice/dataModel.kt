package com.example.ccc_practice

data class Item(
    val img:Int,
    val title:String,
    val content:String,
    val viewType:Int
)

data class ItemHoriz(
    val img:Int,
    val title:String
)
data class ItemGrid(
    val img:Int,
    val title:String,
    val content:String
)


val mainList = arrayListOf<Item>()
val horizList = arrayListOf<ItemHoriz>()
val gridList = arrayListOf<ItemGrid>()

//viewType:
// 0>橫向滑動rView
// 1>網格狀rView
// 2>大卡片
// 3>banner卡片
// 4>標題

fun gDataGenerate(){
    for(i in 0..1){
        gridList.add(ItemGrid(R.drawable.card_9,"作品/專題小卡片作品/專題小卡片作品/專題小卡片作品/專題小卡片作品/專題小卡片","文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹"))
        gridList.add(ItemGrid(R.drawable.card_10,"作品/專題小卡片作品/專題小卡片作品/專題小卡片作品/專題小卡片作品/專題小卡片","文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹"))
        gridList.add(ItemGrid(R.drawable.card_11,"作品/專題小卡片作品/專題小卡片作品/專題小卡片作品/專題小卡片作品/專題小卡片","文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹"))
        gridList.add(ItemGrid(R.drawable.card_12,"作品/專題小卡片作品/專題小卡片作品/專題小卡片作品/專題小卡片作品/專題小卡片","文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹"))

    }
}

fun hDataGenerate(){
    for(i in 0..2){
        horizList.add(ItemHoriz(R.drawable.card_1,"滑動作品小卡片滑動作品小卡片滑動作品小卡片滑動作品小卡片滑動作品小卡片"))
        horizList.add(ItemHoriz(R.drawable.card_2,"滑動專題小卡片滑動專題小卡片滑動專題小卡片滑動專題小卡片滑動專題小卡片"))
        horizList.add(ItemHoriz(R.drawable.card_3,"滑動作品小卡片滑動作品小卡片滑動作品小卡片滑動作品小卡片滑動作品小卡片"))
        horizList.add(ItemHoriz(R.drawable.card_4,"滑動專題小卡片滑動專題小卡片滑動專題小卡片滑動專題小卡片滑動專題小卡片"))
        horizList.add(ItemHoriz(R.drawable.card_5,"滑動作品小卡片滑動作品小卡片滑動作品小卡片滑動作品小卡片滑動作品小卡片"))
        horizList.add(ItemHoriz(R.drawable.card_6,"滑動專題小卡片滑動專題小卡片滑動專題小卡片滑動專題小卡片滑動專題小卡片"))
        horizList.add(ItemHoriz(R.drawable.card_7,"滑動作品小卡片滑動作品小卡片滑動作品小卡片滑動作品小卡片滑動作品小卡片"))
        horizList.add(ItemHoriz(R.drawable.card_8,"滑動專題小卡片滑動專題小卡片滑動專題小卡片滑動專題小卡片滑動專題小卡片"))

    }

}
fun dataGenerate(){

    //viewType填0的那個item就代表是橫向滑動rview
    for(i in 0..1){

        mainList.add(Item(0,"作品滑動小卡片","無",4))
        //橫向滑動 滑動小卡片
        mainList.add(Item(0,"無","無",0))
        mainList.add(Item(0,"無","無",0))

        //縱向     banner卡片
        mainList.add(Item(0,"banner卡片","無",4))
        mainList.add(Item(R.drawable.bn_3,"banner","banner",3))
        mainList.add(Item(R.drawable.bn_4,"banner","banner",3))
        mainList.add(Item(R.drawable.bn_5,"banner","banner",3))
        mainList.add(Item(R.drawable.bn_6,"banner","banner",3))
        mainList.add(Item(R.drawable.bn_7,"banner","banner",3))

        //網格狀   小卡片
        mainList.add(Item(0,"作品/專題小卡片","無",4))
        mainList.add(Item(0,"無","",1))

        //縱向     大卡片
        mainList.add(Item(0,"作品/專題大卡片","無",4))
        mainList.add(Item(R.drawable.work_bigcard,"作品大卡片作品大卡片作品大卡片作品大卡片作品大卡片","文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹",2))
        mainList.add(Item(R.drawable.subject_card,"專題大卡片專題大卡片專題大卡片專題大卡片專題大卡片","文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹",2))
        mainList.add(Item(R.drawable.bn_8,"專題大卡片專題大卡片專題大卡片專題大卡片專題大卡片","文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹",2))
        mainList.add(Item(R.drawable.bn_9,"專題大卡片專題大卡片專題大卡片專題大卡片專題大卡片","文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹",2))
        mainList.add(Item(R.drawable.bn_10,"專題大卡片專題大卡片專題大卡片專題大卡片專題大卡片","文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹文字介紹",2))

    }
}
