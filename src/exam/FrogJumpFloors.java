package exam;

/**
 * 
 * 功能描述：青蛙跳台阶<BR>
 * 输入参数：<按照参数定义顺序>
 * @param 参数说明 返回值: 类型 <说明>
 * @return 返回值
 * @throw 异常描述
 * @see 需要参见的其它内容
 */
public class FrogJumpFloors {

    /**
     * 
     *
     *
     * 功能描述：青蛙跳台阶 <BR>
     * @created 2018年9月3日 下午4:01:19
     * @version 1.0.0
     * @date 2018年9月3日
     * @param FloorNum
     * @return
     */
    public static int JumpFloors(int FloorNum) {
        int result = 0;
        if (FloorNum == 0) {
            result = 0;
        } else if (FloorNum == 1) {
            result = 1;
        } else {
            result = 2 * JumpFloors(FloorNum - 1);
        }

        return result;

    }

    public static void main(String[] args) {
        int a = FrogJumpFloors.JumpFloors(3);
        System.out.println("总共有"+a+"种跳法!!");
    }
}
