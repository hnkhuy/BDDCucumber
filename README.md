# BDDCucumber
#BDD #Cucumber #Java

Notes: 
Đang dùng để chạy Jenkins nhưng hiện không restructure để chạy song song 2 trình duyện được 

Cách run hiện tại là chạy từ Runner của testng vào nhưng testng đang không hỗ trợ parameterize cho runner
nên hiện không thể add thêm 1 trình duyệt vào để chạy song song

Code hiện tại là setup hết driver từ đầu, trong BeforeTest và sau đó init all page(chưa rõ do thèn POM như thế hay 
là do architech cùi nữa, check sau :v ) nên technical debt hiện là không 
hỗ trợ đc parallel, lâu dài thì cũng phải phát triển đến run parallel vs distribution các kiểu thôi, 
chưa gì hết đã dính debt rồi nên là... 

Nên sẽ dừng phát triền fw này ở đây, viết cái mới cố gắng structure để chạy đc parallel, distribution đồng thời adopt
các công nghệ mới hơn.
Một thời gian sau t sẽ quay lại xem có fix đc m ko - dù gì thì m cũng cùng 
t ôn luyện để đi pv các nơi :'(

See ya!
