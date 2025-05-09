# Kiểm tra cổng 1433

netstat -ano | findstr :1433
vd:

> > TCP 0.0.0.0:1433 0.0.0.0:0 LISTENING 5808
> > TCP [::]:1433 [::]:0 LISTENING 5808

# Xem ứng dụng đang chạy 1433 nếu có

tasklist /FI "PID eq 5808"
