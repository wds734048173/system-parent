package org.lanqiao;

import org.junit.Test;
import org.lanqiao.impl.OrderDaoImpl;
import org.lanqiao.impl.ReplyDaoImpl;


import java.util.List;

public class OrderTest {
    @Test
    public void getOrderListTest(){
        IOrderDao orderDao = new OrderDaoImpl();
        List<Order> orderList = orderDao.getOrderList();
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println(orderList.get(i).toString());
        }
    }
    @Test
    public void getReplyListTest(){
        IReplyDao iReplyDao = new ReplyDaoImpl();
        List<Reply> replyList = iReplyDao.getReplyList();
        for (int i = 0; i < replyList.size(); i++) {
            System.out.println(replyList.get(i).toString());
        }
    }

}
