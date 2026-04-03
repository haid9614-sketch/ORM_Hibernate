package org.example;
import org.hibernate.Session;
import  org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // 1. Đọc cấu hình từ file hibernate.cfg.xml
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        // 2. Mở một phiên làm việc (Session) với Database
        Session session = factory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            RestaurantTable table3 = session.get(RestaurantTable.class, 3);
            if(table3 != null) {
                session.remove(table3);
                System.out.println(" DA XOA BAN THANH CONG !!!");
            } else {
                System.out.println(" XOA BAN KHONG THANH CONG!!!");
            }
            transaction.commit();

        } catch(Exception e) {
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
            factory.close();
        }
//        try {
//            transaction = session.beginTransaction();
//            RestaurantTable tableVip = session.get(RestaurantTable.class, 1);
//            if(tableVip != null) {
//                tableVip.setIs_available("coKhach");
//                System.out.println(" da updat trang thai thanh cong !!!");
//            } else {
//                System.out.println("khong thanh cong");
//            }
//            transaction.commit();
//        } catch (Exception e) {
//              transaction.rollback();
//              e.printStackTrace();
//        } finally {
//             session.close();
//             factory.close();
//        }

//        try {
//            transaction = session.beginTransaction();
//            String hql = "from RestaurantTable where is_available = 'trong'";
//            List<RestaurantTable> list = session.createQuery(hql, RestaurantTable.class).getResultList();
//            System.out.println("DANH SACH CAC BAN TRONG LA");
//            for(RestaurantTable table : list) {
//                System.out.println("id ban: " + table.getId() + " | ten ban: " + table.getTable_name() + " | so luong nguoi: " + table.getCapacity());
//            }
//            transaction.commit();
//        } catch (Exception e) {
//            if(transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            session.close();
//            factory.close();
//        }
        // try {
        //     transaction = session.beginTransaction();
        //     RestaurantTable table1 = new RestaurantTable("vip", 10, "trong");
        //     RestaurantTable table2 = new RestaurantTable("thuong", 5, "trong");
        //     RestaurantTable table3 = new RestaurantTable("ngoai_san", 4, "trong");
        //    session.persist(table1);
        //    session.persist(table2);
        //    session.persist(table3);
        //    transaction.commit();
        //    System.out.println(" DA LUU XUONG DATABASE THANH CONG !!!!!!!!!!");
        // } catch (Exception e) {
        //    if(transaction != null) {
        //        transaction.rollback();
        //    }
        //    e.printStackTrace();
        // } finally {
        //    session.close();
        //    factory.close();
        // }
        // try {
            // Bắt đầu một giao dịch (Transaction) - Bắt buộc khi muốn thay đổi dữ liệu (Insert/Update/Delete)
         //   transaction = session.beginTransaction();
            // 3. Tạo một đối tượng Student mới bằng Java thuần (Không hề có SQL)
        // Student student1 = new Student("Duong", "duong.it@example.com");
            // 4. Lưu xuống Database thông qua Hibernate
        // session.persist(student1);
            // Xác nhận giao dịch thành công để lưu vĩnh viễn
           // transaction.commit();
            // System.out.println("🎉 Đã lưu sinh viên thành công xuống DB!");
        // } catch (Exception e) {
        //    if (transaction != null) {
        //        transaction.rollback(); // Hủy bỏ thao tác nếu có lỗi xảy ra
        //    }
        //    e.printStackTrace();
        // } finally {
            // Đóng kết nối để giải phóng tài nguyên
           // session.close();
           // factory.close();
        // }
    }
}
