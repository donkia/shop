insert
    into
        member
        (address, email, name, password, role, member_id)
    values
        ('11', 'bhkim92@naver.com', 'kim' ,'$2a$10$u14JgiJQScGIb2hJGr7NEuDVMpB7iU9VvwrbukSvN4q4Hx0HP99/W', 'ADMIN',1);

insert
    into
        item
        (reg_time, update_time, created_by, modified_by, item_detail, item_nm, item_sell_status, price, stock_number, item_id)
    values
        ('2022-03-15T13:46:31.315916400', '2022-03-15T13:46:31.315916400', 'bhkim92@naver.com', '22. 3. 15. 오후 1:46', '태스트상품입니다.', '테스트상품', 'SELL', 10000, 5, 1);

 insert
    into
        item_img
        (reg_time, update_time, created_by, modified_by, img_name, img_url, item_id, ori_img_name, repimg_yn, item_img_id)
    values
        ('2022-03-15T13:46:31.315916400', '2022-03-15T13:46:31.315916400', 'bhkim92@naver.com', '22. 3. 15. 오후 1:46', '4fe8866c-ec1e-47f6-ae18-05954e7415db.jpg', '/images/item/4fe8866c-ec1e-47f6-ae18-05954e7415db.jpg', 1, '김병현님_인터넷용.jpg', 'Y', 2);

 insert
    into
        item_img
        (reg_time, update_time, created_by, modified_by, img_name, img_url, item_id, ori_img_name, repimg_yn, item_img_id)
    values
        ('2022-03-15T13:46:31.315916400', '2022-03-15T13:46:31.315916400', 'bhkim92@naver.com', '22. 3. 15. 오후 1:46', '', '', 1, '', 'N', 3);

insert
    into
        item_img
        (reg_time, update_time, created_by, modified_by, img_name, img_url, item_id, ori_img_name, repimg_yn, item_img_id)
    values
        ('2022-03-15T13:46:31.315916400', '2022-03-15T13:46:31.315916400', 'bhkim92@naver.com', '22. 3. 15. 오후 1:46', '', '', 1, '', 'N', 4);

insert
    into
        item_img
        (reg_time, update_time, created_by, modified_by, img_name, img_url, item_id, ori_img_name, repimg_yn, item_img_id)
    values
        ('2022-03-15T13:46:31.315916400', '2022-03-15T13:46:31.315916400', 'bhkim92@naver.com', '22. 3. 15. 오후 1:46', '', '', 1, '', 'N', 5);

insert
    into
        item_img
        (reg_time, update_time, created_by, modified_by, img_name, img_url, item_id, ori_img_name, repimg_yn, item_img_id)
    values
        ('2022-03-15T13:46:31.315916400', '2022-03-15T13:46:31.315916400', 'bhkim92@naver.com', '22. 3. 15. 오후 1:46', '', '', 1, '', 'N', 6);



