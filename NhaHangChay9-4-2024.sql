

create database NhaHangChay_CohesiveStars;
go


use NhaHangChay_CohesiveStars;
go

create table NhanVien (
	MaNhanVien int identity(1, 1) primary key,
	TenNhanVien nvarchar(30) not null,
	ChucVu bit not null,
	TrangThai nvarchar(20) not null,
	GioiTinh bit not null,
	SDT varchar(15) not null,
	Email varchar(50),
	HinhAnh varchar(500) null,
);
go

create table TaiKhoan (
	TenTaiKhoan varchar(20) primary key,
	MatKhau varchar(50) not null,
	VaiTro bit not null,
	MaNhanVien int
);
go

create table KhachHang (
	MaKhachHang int identity(1, 1) primary key,
	TenKhachHang nvarchar(30) ,
	SDT varchar(15),
	NgaySinh date
);
go

create table ThanhVien (
	MaThanhVien int identity(1, 1) primary key,
	NgayDangKy datetime not null,
	DiemThuong int,
	MaKhachHang int
);
go

create table PhieuDatBan (
	MaPhieuDatBan int identity(1, 1) primary key,
	ThoiGianDat datetime default getdate(),
	MaKhachHang int null
);
go


create table Ban (
	MaBan int identity(1, 1) primary key,
	ViTri nvarchar(30) not null,
	TrangThai nvarchar(20) not null);
go

create table ChiTietDatBan (
	MaBan int,
	MaPhieuDatBan int,
	primary key (MaBan, MaPhieuDatBan)
);
go

create table DanhGia (
	MaDanhGia int identity(1, 1) primary key,
	DanhGia nvarchar(20) not null
);
go

create table LoaiMon (
	MaLoaiMon int identity(1, 1) primary key,
	TenLoaiMon nvarchar(20) not null
);
go

create table MonAn (
	MaMonAn int identity(1, 1) primary key,
	TenMonAn nvarchar(50) not null,
	DonGia money not null,
	soLuong int,
	HinhAnh varchar(500),
	TrangThai nvarchar(30) not null,
	MaLoaiMon int,
	MaThucDon int,
	);
go

create table ThucDon (
	MaThucDon int identity(1, 1) primary key,
	TenThucDon nvarchar(50) not null,
	NgayPhucVu nvarchar(100) not null
);
go

create table ChiTietGM (
	MaPhieuDatBan int,
	MaMonAn int,
	SoLuong int not null,
	GhiChu nvarchar(200),
	MaDanhGia int,
	primary key (MaPhieuDatBan, MaMonAn)
);
go

create table KhuyenMai (
	MaKhuyenMai int identity(1, 1) primary key,
	MoTa nvarchar(300) not null,
	PhanTram int not null,
	SoLuong int not null,
	NgayBatDau datetime not null,
	NgayKetThuc datetime not null);
go

create table HoaDon (
	MaHoaDon int identity(1, 1) primary key,
	NgayLap datetime not null default getdate(),
	TienMonAn money ,
	TienGiamDiemThuong money default 0,
	TienGiamKhuyenMai money default 0,
	TongTien money,
	PhuongThucThanhToan bit,
	TrangThai bit,
	MaPhieuDatBan int,
	MaKhuyenMai int,
	MaNhanVien int
);
go

alter table ThanhVien
add
	constraint fk_tv_kh
	foreign key (MaKhachHang)
	references KhachHang(MaKhachHang)
;
go

alter table TaiKhoan
add
	constraint fk_tk_nv
	foreign key (MaNhanVien)
	references NhanVien(MaNhanVien)
;
go

alter table PhieuDatBan
add
	constraint fk_pdb_kh
	foreign key (MaKhachHang)
	references KhachHang(MaKhachHang)
;
go

alter table ChiTietDatBan
add
	constraint fk_ctdb_b
	foreign key (MaBan)
	references Ban(MaBan),

	constraint fk_ctdb_pdb
	foreign key (MaPhieuDatBan)
	references PhieuDatBan(MaPhieuDatBan)
;
go

alter table MonAn
add
	constraint fk_ma_l
	foreign key (MaLoaiMon)
	references LoaiMon(MaLoaiMon),

	constraint fk_ma_td
	foreign key (MaThucDon)
	references ThucDon(MaThucDon)
;
go


alter table ChiTietGM
add
	constraint fk_ctgm_pdb
	foreign key (MaPhieuDatBan)
	references PhieuDatBan(MaPhieuDatBan),

	constraint fk_ctgm_ma
	foreign key (MaMonAn)
	references MonAn(MaMonAn),

	constraint fk_ctgm_dg
	foreign key (MaDanhGia)
	references DanhGia(MaDanhGia)
;
go

alter table HoaDon
add
	constraint fk_hd_db
	foreign key (MaPhieuDatBan)
	references PhieuDatBan(MaPhieuDatBan),

	constraint fk_hd_km
	foreign key (MaKhuyenMai)
	references KhuyenMai(MaKhuyenmai),

	constraint fk_hd_nv
	foreign key (MaNhanVien)
	references NhanVien(MaNhanVien)
;
go
insert into NhanVien (TenNhanVien, ChucVu, TrangThai, GioiTinh, SDT, Email, HinhAnh) values
	(N'Nguyễn Dương Thiên Lý', 1, N'Hoạt động', 1, '0101010101', 'lyndtps36846@fpt.edu.vn', 'CLy.jpg'),
	(N'Võ Thanh Tùng', 1, N'Hoạt động', 0, '0202020202', 'tungvtps27852@fpt.edu.vn', 'ATung.jpg'),
	(N'Vũ Đăng Quang', 0, N'Nghỉ', 0, '0303030303', 'quangvdps36680@fpt.edu.vn', 'AQuangB.png'),
	(N'Vũ Hoàng Chương', 0, N'Hoạt động', 0, '0404040404', 'chuongvhps36806@fpt.edu.vn', 'AChuong.jpg'),
	(N'Bùi Minh Quang', 0, N'Hoạt động', 0, '0505050505', 'quangbmps28437@fpt.edu.vn', 'AQuangN.png'),
	(N'Phạm Ngọc Rôn', 0, N'Hoạt động', 0, '0606060606', 'ronpnps36596@fpt.edu.vn', 'Td.jpg');
go

insert into TaiKhoan (TenTaiKhoan, MatKhau, VaiTro, MaNhanVien) values
	('LyNDT', '123', 1, 1),
	('TungVT', '123', 1, 2),
	('QuangVD', '123', 0, 3),
	('ChuongVH', '123', 0, 4),
	('QuangBM', '123', 0, 5),
	('RonPN', '123', 0, 6);
go

insert into KhachHang (TenKhachHang, SDT, NgaySinh) values
	(N'Nguyễn Hải Triều', '1010101010', '2004-09-23'),
	(N'Dương Quang Nghĩa', '2020202020', null),
	(N'Mai Việt Cường', '3030303030', null),
	(N'Trần Văn Đủ', '4040404040', null),
	(N'Vũ Long Hoàng', '5050505050', '1999-07-01'),
	(N'Trương Thị Ngọc Minh', '6060606060', '2001-07-25'),
	(N'Vũ Thế Vĩnh', '7070707070', '1957-12-07'),
	(N'Nguyễn Thị Tuyết Ánh', '8080808080', '1967-07-20'),
	(N'Phạm Đức Hải Duy', '9090909090', '1998-08-22'),
	(N'Nguyễn Tuấn Quỳnh', '1212121212', '1998-01-25'),
	(N'Phạm Ngọc Thạch', '1313131313', null),
	(N'Phan Tấn Trung', '1414141414', null),
	(N'Nguyễn Văn Sang', '1111111111', '1990-01-01'),
    (N'Trần Thị Yến', '2222222222', '1995-05-05'),
    (N'Lê Văn Giàu', '3333333333', '2000-10-10'),
    (N'Phạm Thị Mơ', '4444444444', '1998-08-08'),
    (N'Hồ Văn Nguyên', '5555555555', null),
    (N'Vũ Thị Phượng', '6666666666', null),
    (N'Đỗ Văn Quân', '7777777777', null),
    (N'Bùi Thị Trâm', '8888888888', null);
go

insert into ThanhVien (NgayDangKy, DiemThuong, MaKhachHang) values
	('2024-01-18', 5000, 1),
	('2024-02-03', 0, 5),
	('2023-07-09', 2000, 6),
	('2023-05-01', 3000, 7),
	('2023-01-23', 7000, 8),
	('2023-09-16', 5500, 9),
	('2023-12-24', 9000, 10);
go

insert into Ban (ViTri, TrangThai) values
	(N'Tầng 1, Bàn 1', N'Trống'),
	(N'Tầng 1, Bàn 2', N'Trống'),
	(N'Tầng 1, Bàn 3', N'Trống'),
	(N'Tầng 1, Bàn 4', N'Trống'),
	(N'Tầng 1, Bàn 5', N'Trống'),
	(N'Tầng 1, Bàn 6', N'Trống'),
	(N'Tầng 1, Bàn 7', N'Trống'),
	(N'Tầng 1, Bàn 8', N'Trống'),
	(N'Tầng 1, Bàn 9', N'Trống'),
	(N'Tầng 1, Bàn 10', N'Trống'),
	(N'Tầng 1, Bàn 11', N'Trống'),
	(N'Tầng 1, Bàn 12', N'Trống'),
	(N'Tầng 2, Bàn 1', N'Trống'),
	(N'Tầng 2, Bàn 2', N'Trống'),
	(N'Tầng 2, Bàn 3', N'Trống'),
	(N'Tầng 2, Bàn 4', N'Trống'),
	(N'Tầng 2, Bàn 5', N'Trống'),
	(N'Tầng 2, Bàn 6', N'Trống'),
	(N'Tầng 2, Bàn 7', N'Trống'),
	(N'Tầng 2, Bàn 8', N'Trống'),
	(N'Tầng 2, Bàn 9', N'Trống'),
	(N'Tầng 2, Bàn 10', N'Trống'),
	(N'Tầng 2, Bàn 11', N'Trống'),
	(N'Tầng 2, Bàn 12', N'Trống'),
	(N'Tầng 3, Bàn 1', N'Trống'),
	(N'Tầng 3, Bàn 2', N'Trống'),
	(N'Tầng 3, Bàn 3', N'Trống'),
	(N'Tầng 3, Bàn 4', N'Trống'),
	(N'Tầng 3, Bàn 5', N'Trống'),
	(N'Tầng 3, Bàn 6', N'Trống'),
	(N'Tầng 3, Bàn 7', N'Trống'),
	(N'Tầng 3, Bàn 8', N'Trống'),
	(N'Tầng 3, Bàn 9', N'Trống'),
	(N'Tầng 3, Bàn 10', N'Trống'),
	(N'Tầng 3, Bàn 11', N'Trống'),
	(N'Tầng 3, Bàn 12', N'Trống');
go

insert into PhieuDatBan (ThoiGianDat, MaKhachHang) values
	('2024-01-18 09:00', 1),
	('2024-01-19 12:00', 2),
	('2024-01-19 17:00', 3),
	('2023-02-04 17:00', 4),
    ('2023-03-10 09:00', 5),
    ('2023-04-15 12:00', 6),
    ('2023-05-18 17:00', 7),
    ('2023-06-20 09:00', 8),
    ('2023-07-25 12:00', 9),
    ('2023-08-30 17:00', 10),
    ('2023-09-05 09:00', 11),
    ('2023-12-28 17:00', 12),
    ('2024-01-01 09:00', 13),
    ('2024-02-03 12:00', 4),
    ('2024-03-05 17:00', 15),
    ('2024-04-07 09:00', 6),
    ('2024-05-10 12:00', 17),
    ('2024-06-12 17:00', 8),
    ('2024-07-15 09:00', 19),
    ('2024-08-18 12:00', 10),
    ('2024-09-20 17:00', 12),
    ('2024-10-23 09:00', 2),
    ('2024-11-25 12:00', 13),
    ('2024-12-28 17:00', 4),
    ('2024-01-01 09:00', 15),
    ('2024-02-03 12:00', 6),
    ('2024-03-05 17:00', 17),
    ('2024-04-07 09:00', 8),
    ('2024-05-10 12:00', 19),
	('2024-11-25 12:00', 10),
	('2023-01-01 09:00', 1),
    ('2023-02-02 12:00', 20),
    ('2023-03-03 17:00', 3),
    ('2023-04-04 09:00', 4),
    ('2023-05-05 12:00', 5),
    ('2023-06-06 17:00', 6),
    ('2023-07-07 09:00', 7),
    ('2023-08-08 12:00', 8),
    ('2023-09-09 17:00', 9),
    ('2023-10-10 09:00', 10),
    ('2023-11-11 12:00', 11),
    ('2023-12-12 17:00', 12),
    ('2024-01-01 09:00', 13),
    ('2024-02-02 12:00', 14),
    ('2024-03-03 17:00', 15),
    ('2024-04-04 09:00', 16),
    ('2024-05-05 12:00', 17),
    ('2024-06-06 17:00', 18),
    ('2024-07-07 09:00', 19),
    ('2024-08-08 12:00', 20),
    ('2024-09-09 17:00', 11),
    ('2024-10-10 09:00', 2),
    ('2024-11-11 12:00', 3),
    ('2024-12-12 17:00', 14),
    ('2024-01-01 09:00', 15),
    ('2024-02-02 12:00', 16),
    ('2024-03-03 17:00', 17),
    ('2024-04-04 09:00', 8),
    ('2024-05-05 12:00', 9),
    ('2024-06-06 17:00', 10);	
go

insert into ChiTietDatBan (MaBan, MaPhieuDatBan) values
	(1, 1), (2, 2), (3, 3), (4, 4), (5, 5),
    (6, 6), (7, 7), (8, 8), (9, 9), (10, 10),
    (11, 11), (12, 12), (13, 13), (14, 14), (15, 15),
    (16, 16), (17, 17), (18, 18), (19, 19), (20, 20),
    (21, 21), (22, 22), (23, 23), (24, 24), (25, 25),
    (26, 26), (27, 27), (28, 28), (29, 29), (30, 30),
    (21, 31), (12, 32), (23, 33), (4, 34), (5, 35),
    (6, 36), (11, 37), (22, 38), (13, 39), (14, 40),
    (15, 41), (6, 42), (7, 43), (18, 44), (29, 45),
    (10, 46), (21, 47), (12, 48), (3, 49), (4, 50),
    (15, 51), (26, 52), (7, 53), (18, 54), (9, 55),
    (20, 56), (11, 57), (22, 58), (3, 59), (14, 60);
go

insert into LoaiMon (TenLoaiMon) values
	(N'Bún'),
	(N'Cơm'),
	(N'Khai vị'),
	(N'Khác');
go

insert into ThucDon (TenThucDon, NgayPhucVu) values
	(N'Ngày chẵn', '2-4-6-CN'),
	(N'Ngày lẻ', '3-5-7');
go

insert into MonAn ( TenMonAn, DonGia, SoLuong, HinhAnh, TrangThai, MaLoaiMon, MaThucDon) values
    (N'Salad mít non', 125000, 50, 'xa-lach-mit-non-2.png', N'Hoạt động', 3, 1),
    (N'Mozzarella Salad', 135000, 50,'saladmozarella.png', N'Hoạt động', 3, 2),
    (N'Gỏi cuốn rau củ', 90000, 50,'goicuonraucu.png', N'Hoạt động', 3, 1),
    (N'Chả giò', 95000, 50,'chagio.png', N'Hoạt động', 4, 2),
    (N'Há cảo Nhật - Gyoza', 95000, 50, 'hacaonhat.png', N'Hoạt động', 4, 1),
    (N'Chả nấm mối', 120000, 50,  'chachammuoi.png', N'Hoạt động', 4, 2),
    (N'Bún nưa trộn', 105000, 50, 'bunnuatron.png', N'Hoạt động', 1, 1),
    (N'Gỏi củ hủ dừa', 115000, 50,  'coicuhudua.png', N'Hoạt động', 3, 2),
    (N'Gỏi đu đủ', 105000, 50,  'goidudu.png', N'Hoạt động', 3, 1),
    (N'Salad Sung', 135000, 50, 'saladsung.png', N'Hoạt động', 3, 2),
    (N'Bánh tart artiso', 105000, 50, 'banhtart.png', N'Ngừng phục vụ',4, 1),
    (N'Đậu hủ bó xôi sốt trứng muối', 125000, 50,  'dauhuboxoi.png', N'Hoạt động', 4, 2),
    (N'Nấm đông cô sốt tiêu', 95000, 50, 'namdongcosottieu.png', N'Hoạt động', 4, 1),
    (N'Đậu rồng xào tỏi đen', 90000, 50, 'dau-rong-xao-1.png', N'Hoạt động', 3, 1),
    (N'Tàu hủ ky sốt chao', 110000, 50, 'tau-ku-ky-1.png', N'Hoạt động',4, 2),
    (N'Mướp xào', 90000, 50, 'muop-xao-1.png', N'Hoạt động', 4, 1),
    (N'Nấm mối xào lá lốt', 125000, 50, 'nam-moi-xao-1.png', N'Hoạt động', 4, 1),
    (N'Đu đủ xào', 90000, 50, 'du-du-xao-1.png', N'Hoạt động', 4, 2),
    (N'Măng xào củ kiệu', 105000, 50, 'mang-xao-cu-kieu-1.png', N'Hoạt động', 4, 1),
    (N'Khổ qua kho ngũ vị', 95000, 50, 'kho-qua-kho-1.png', N'Hoạt động', 4, 2),
    (N'Đậu hủ kim chi', 95000, 50, 'dau-hu-kim-chi-1.png', N'Hoạt động', 4, 1),
    (N'Rau củ om Thái', 110000, 50, 'rau-cu-om-thai-1.png', N'Hoạt động', 4, 2),
    (N'Nấm kho', 105000, 50, 'nam-kho-2.png', N'Ngừng phục vụ', 3, 1),
    (N'Cơm nếp than', 40000, 50, 'com-cac-loai.png', N'Hoạt động', 2, 1),
    (N'Cơm trắng', 40000, 50, 'com-cac-loai.png', N'Hoạt động', 2, 2),
    (N'Cơm bó xôi hạt sen', 40000, 50, 'com-cac-loai.png', N'Hoạt động', 2, 1),
    (N'Mì Ý sốt rau củ', 150000, 50, 'mi-y-sot-rau-cu-1.png', N'Hoạt động', 4, 2),
    (N'Bún nưa xào', 125000, 50, 'bun-nua-xao-1.png', N'Hoạt động',1, 1),
    (N'Mì sốt kem nấm', 150000, 50, 'mi-sot-kem-nam-2.png', N'Hoạt động', 4, 2),
    (N'Cơm cà ri', 125000, 50, 'com-cari-1.png', N'Hoạt động', 2, 1);
go

/*
insert into ChiTietTD (MaThucDon, MaMonAn)
values
    (1, 1), (1, 2), (1, 3), (1, 4), (1, 5),
    (1, 6), (1, 7), (1, 8), (1, 9), (1, 10),
    (1, 11), (1, 12), (1, 13), (1, 14), (1, 15),
    (1, 16), (1, 17), (1, 18), (1, 19), (1, 20),
    (1, 21), (1, 22), (1, 23), (1, 24), (1, 25),
    (1, 26), (1, 27), (1, 28), (1, 29), (1, 30);
*/

insert into DanhGia (DanhGia) values
	(N'Tệ'),
	(N'Không ngon'),
	(N'Bình thường'),
	(N'Khá ổn'),
	(N'Tuyệt vời');
go

insert into ChiTietGM (MaPhieuDatBan, MaMonAn, SoLuong, GhiChu, MaDanhGia) values
	(1, 1, 1, N'Làm mặn xíu', 5),
	(1, 14, 1, null, 1),
	(1, 7, 2, N'Thêm tương ớt', 5),
	(2, 21, 1, null, 1),
	(2, 2, 1, null, 1),
	(2, 4, 1, null, null),
	(2, 16, 2, null, 4),
	(3, 1, 1, N'Không hành', 4),
	(3, 24, 1, null, 1),
	(4, 30, 1, N'Cần thêm nước sốt', 3),
    (4, 15, 1, null, 4),
    (4, 28, 2, N'Đặc biệt yêu cầu chảo sôi', 5),
    (5, 3, 1, N'Loại bỏ tiêu và hành', 2),
    (5, 6, 1, null, 3),
    (5, 18, 1, null, 4),
    (6, 1, 1, N'Thêm tiêu và ớt', 4),
    (6, 4, 1, null, 3),
    (6, 27, 2, N'Đặc biệt không muối', 2),
    (7, 2, 1, null, 1),
    (7, 5, 1, null, 1),
    (7, 8, 1, null, 1),
    (8, 11, 1, N'Loại bỏ hành', 3),
    (8, 3, 1, null, 4),
    (8, 6, 2, N'Không thêm gia vị', 5),
    (9, 22, 1, null, 1),
    (9, 4, 1, null, 1),
    (9, 7, 1, null, 1),
    (10, 11, 1, null, 1),
    (10, 30, 1, null, 1),
    (10, 6, 1, null, 1),
    (11, 2, 1, null, 1),
    (11, 25, 1, null,1),
    (11, 8, 1, null, 4),
    (12, 1, 1, null, 5),
    (12, 14, 1, null, 4),
    (12, 7, 1, null, 3),
    (13, 2, 1, null, 2),
    (13, 23, 1, null, 3),
    (13, 6, 1, null, 4),
	(14, 4, 1, N'Thêm gia vị đặc biệt', 5),
    (14, 17, 1, null, 4),
    (14, 9, 2, N'Yêu cầu nấu chín kỹ', 3),
    (15, 21, 1, N'Không hành và tiêu', 4),
    (15, 3, 1, null, 5),
    (15, 16, 1, null, 3),
    (16, 2, 1, null, 2),
    (16, 4, 1, null, 4),
    (16, 27, 1, null, 5),
    (17, 1, 1, N'Thêm tiêu xanh', 5),
    (17, 30, 1, null, 4),
    (17, 5, 1, null, 3),
    (18, 12, 1, null, 2),
    (18, 4, 1, null, 4),
    (18, 27, 1, null, 5),
    (19, 1, 1, null, 4),
    (19, 13, 1, null, 3),
    (19, 5, 1, null, 2),
    (20, 2, 1, null, 5),
    (20, 24, 1, null, 4),
    (20, 7, 1, null, 3),
    (21, 11, 1, null, 2),
    (21, 3, 1, null, 3),
    (21, 26, 1, null, 4),
    (22, 2, 1, null, 5),
    (22, 5, 1, null, 3),
	(22, 17, 1, null, 4),
	(23, 1, 1, null, 5),
	(23, 24, 1, null, 4),
	(23, 7, 1, null, 3),
	(24, 2, 1, null, 2),
	(24, 23, 1, null, 3),
	(24, 6, 1, null, 4),
	(25, 22, 1, null, 5),
	(25, 4, 1, null, 4),
	(25, 17, 1, null, 3),
	(26, 1, 1, null, 2),
	(26, 13, 1, null, 3),
	(26, 6, 1, null, 4),
	(27, 21, 1, null, 5),
	(27, 4, 1, null, 4),
	(27, 17, 1, null, 3),
	(28, 2, 1, null, 2),
	(28, 3, 1, null, 3),
	(28, 26, 1, null, 4),
	(29, 1, 1, null, 5),
	(29, 4, 1, null, 4),
	(29, 17, 1, null, 3),
	(30, 22, 1, null, 2),
	(30, 3, 1, null, 3),
	(30, 6, 1, null, 4),
	(31, 12, 1, null, 5),
	(31, 5, 1, null, 4),
	(31, 27, 1, null, 3),
	(32, 1, 1, null, 2),
	(32, 13, 1, null, 3),
	(32, 6, 1, null, 4),
	(33, 1, 1, null, 5),
	(33, 24, 1, null, 4),
	(33, 7, 1, null, 3),
	(34, 2, 1, null, 2),
	(34, 13, 1, null, 3),
	(34, 6, 1, null, 4),
	(35, 22, 1, null, 5),
	(35, 4, 1, null, 4),
	(35, 17, 1, null, 3),
	(36, 1, 1, null, 2),
	(36, 3, 1, null, 3),
	(36, 16, 1, null, 4),
	(37, 1, 1, null, 5),
    (37, 14, 1, null, 4),
    (37, 7, 1, null, 3),
    (38, 12, 1, null, 2),
    (38, 25, 1, null, 3),
    (38, 8, 1, null, 4),
    (39, 1, 1, null, 5),
    (39, 23, 1, null, 4),
    (39, 6, 1, null, 3),
    (40, 2, 1, null, 2),
    (40, 14, 1, null, 4),
    (40, 7, 1, null, 5),
    (41, 1, 1, null, 4),
    (41, 23, 1, null, 3),
    (41, 6, 1, null, 2),
    (42, 2, 1, null, 5),
    (42, 5, 1, null, 4),
    (42, 18, 1, null, 3),
    (43, 1, 1, null, 2),
    (43, 14, 1, null, 3),
    (43, 7, 1, null, 4),
    (44, 2, 1, null, 5),
    (44, 13, 1, null, 4),
    (44, 6, 1, null, 3),
    (45, 1, 1, null, 2),
    (45, 23, 1, null, 3),
    (45, 6, 1, null, 4),
    (46, 1, 1, null, 5),
    (46, 14, 1, null, 4),
    (46, 7, 1, null, 3),
	(47, 2, 1, null, 5),
    (47, 23, 1, null, 4),
    (47, 6, 1, null, 3),
    (48, 1, 1, null, 2),
    (48, 24, 1, null, 3),
    (48, 7, 1, null, 4),
    (49, 12, 1, null, 5),
    (49, 5, 1, null, 4),
    (49, 8, 1, null, 3),
    (50, 11, 1, null, 2),
    (50, 3, 1, null, 3),
    (50, 16, 1, null, 4),
    (51, 2, 1, null, 5),
    (51, 14, 1, null, 4),
    (51, 7, 1, null, 3),
    (52, 1, 1, null, 2),
    (52, 13, 1, null, 3),
    (52, 6, 1, null, 4),
    (53, 12, 1, null, 5),
    (53, 5, 1, null, 4),
    (53, 18, 1, null, 3),
    (54, 1, 1, null, 2),
    (54, 24, 1, null, 3),
    (54, 7, 1, null, 4),
    (55, 12, 1, null, 5),
    (55, 3, 1, null, 4),
    (55, 6, 1, null, 3),
    (56, 11, 1, null, 2),
    (56, 3, 1, null, 3),
    (56, 16, 1, null, 4),
	(57, 2, 1, null, 5),
    (57, 14, 1, null, 4),
    (57, 7, 1, null, 3),
    (58, 1, 1, null, 2),
    (58, 23, 1, null, 3),
    (58, 6, 1, null, 4),
    (59, 12, 1, null, 5),
    (59, 5, 1, null, 4),
    (59, 18, 1, null, 3),
    (60, 21, 1, null, 2);
go

insert into KhuyenMai (MoTa, PhanTram, SoLuong, NgayBatDau, NgayKetThuc) values
	(N'Mừng khai trương', 50, 200, '2024-01-18', '2024-01-19 23:59'),
	(N'Mừng sinh nhật', 10, 10000, '2024-01-18', '2025-01-17 23:59'),
	(N'Quảng bá món mới', 15, 300, '2024-03-01', '2024-03-07 23:59');
go

insert into HoaDon (NgayLap, TienMonAn, TienGiamDiemThuong, TienGiamKhuyenMai, TongTien, PhuongThucThanhToan, TrangThai, MaPhieuDatBan, MaKhuyenMai, MaNhanVien) values
	('2024-01-18 10:00', 160000, 0, 80000, 80000, 0,1, 1, 1, 2),
	('2024-01-19 13:30', 210000, 0, 105000, 105000, 1,1, 2, 1, 1),
	('2024-01-19 17:30', 110000, 0, 55000, 55000, 1,1, 3, 1, 2),
	('2023-01-01 09:00', 180000, 0, 90000, 90000, 0,1, 4, 2, 1),
    ('2023-02-11 12:00', 220000, 0, 110000, 110000, 1,1, 5, 1, 2),
    ('2023-03-21 15:00', 120000, 0, 60000, 60000, 1,1, 6, 1, 1),
    ('2023-04-03 09:00', 170000, 0, 85000, 85000, 0,1, 7, 2, 2),
    ('2023-05-24 12:00', 200000, 0, 100000, 100000, 1,1, 8, 1, 1),
    ('2023-06-17 15:00', 130000, 0, 65000, 65000, 1,1, 9, 1, 2),
    ('2023-07-01 09:00', 150000, 0, 75000, 75000, 0,1, 10, 2, 1),
    ('2023-08-28 12:00', 190000, 0, 95000, 95000, 1,1, 11, 1, 2),
    ('2023-09-19 15:00', 140000, 0, 70000, 70000, 1,1, 12, 1, 1),
    ('2023-10-21 09:00', 160000, 0, 80000, 80000, 0,1, 13, 2, 2),
    ('2023-11-26 12:00', 210000, 0, 105000, 105000, 1,1, 14, 1, 1),
    ('2023-12-11 15:00', 110000, 0, 55000, 55000, 1,1, 15, 1, 2),
    ('2024-01-21 09:00', 180000, 0, 90000, 90000, 0,1, 16, 2, 1),
    ('2024-02-11 12:00', 220000, 0, 110000, 110000, 1,1, 17, 1, 2),
    ('2024-03-17 15:00', 120000, 0, 60000, 60000, 1,1, 18, 1, 1),
    ('2024-04-14 09:00', 170000, 0, 85000, 85000, 0,1, 19, 2, 2),
    ('2024-05-22 12:00', 200000, 0, 100000, 100000, 1,1, 20, 1, 1),
    ('2024-06-14 15:00', 130000, 0, 65000, 65000, 1,1, 21, 1, 2),
    ('2024-07-01 09:00', 150000, 0, 75000, 75000, 0,1, 22, 2, 1),
    ('2024-08-18 12:00', 190000, 0, 95000, 95000, 1,1, 23, 1, 2),
    ('2024-09-21 15:00', 140000, 0, 70000, 70000, 1,1, 24, 1, 1),
    ('2024-10-16 09:00', 160000, 0, 80000, 80000, 0,1, 25, 2, 2),
    ('2024-11-21 12:00', 210000, 0, 105000, 105000, 1,1, 26, 1, 1),
    ('2023-12-17 15:00', 110000, 0, 55000, 55000, 1,1, 27, 1, 2),
    ('2023-02-23 10:00', 180000, 0, 90000, 90000, 0,1, 28, 2, 1),
    ('2023-02-24 13:30', 220000, 0, 110000, 110000, 1,1, 29, 1, 2),
	('2023-07-01 09:00', 150000, 0, 75000, 75000, 0,1, 30, 2, 1),
	('2023-08-28 12:00', 190000, 0, 95000, 95000, 1,1, 31, 1, 2),
	('2023-09-19 15:00', 140000, 0, 70000, 70000, 1,1, 32, 1, 1),
	('2023-10-21 09:00', 160000, 0, 80000, 80000, 0,1, 33, 2, 2),
	('2023-11-26 12:00', 210000, 0, 105000, 105000, 1,1, 34, 1, 1),
	('2023-12-11 15:00', 110000, 0, 55000, 55000, 1,1, 35, 1, 2),	
	('2024-01-21 09:00', 180000, 0, 90000, 90000, 0,1, 36, 2, 1),
	('2024-02-11 12:00', 220000, 0, 110000, 110000, 1,1, 37, 1, 2),
	('2024-03-17 15:00', 120000, 0, 60000, 60000, 1,1, 38, 1, 1),
	('2024-04-14 09:00', 170000, 0, 85000, 85000, 0,1, 39, 2, 2),
	('2024-05-22 12:00', 200000, 0, 100000, 100000, 1,1, 40, 1, 1),
	('2024-06-14 15:00', 130000, 0, 65000, 65000, 1,1, 41, 1, 2),
	('2024-07-01 09:00', 150000, 0, 75000, 75000, 0,1, 42, 2, 1),
	('2024-08-18 12:00', 190000, 0, 95000, 95000, 1,1, 43, 1, 2),
	('2024-09-21 15:00', 140000, 0, 70000, 70000, 1,1, 44, 1, 1),
	('2024-10-16 09:00', 160000, 0, 80000, 80000, 0,1, 45, 2, 2),
	('2024-11-21 12:00', 210000, 0, 105000, 105000, 1,1, 46, 1, 1),
	('2023-12-17 15:00', 110000, 0, 55000, 55000, 1,1, 47, 1, 2),
	('2023-02-23 10:00', 180000, 0, 90000, 90000, 0,1, 48, 2, 1),
	('2023-02-24 13:30', 220000, 0, 110000, 110000, 1,1, 49, 1, 2),
	('2023-03-21 15:00', 120000, 0, 60000, 60000, 1,1, 50, 1, 1),
	('2023-04-03 09:00', 170000, 0, 85000, 85000, 0,1, 51, 2, 2),
	('2023-05-24 12:00', 200000, 0, 100000, 100000, 1,1, 52, 1, 1),
	('2023-06-17 15:00', 130000, 0, 65000, 65000, 1,1, 53, 1, 2),
	('2023-07-01 09:00', 150000, 0, 75000, 75000, 0,1, 54, 2, 1),
	('2023-08-28 12:00', 190000, 0, 95000, 95000, 1,1, 55, 1, 2),
	('2023-09-19 15:00', 140000, 0, 70000, 70000, 1,1, 56, 1, 1),
	('2023-10-21 09:00', 160000, 0, 80000, 80000, 0,1, 57, 2, 2),
	('2023-11-26 12:00', 210000, 0, 105000, 105000, 1,1, 58, 1, 1),
	('2023-12-11 15:00', 110000, 0, 55000, 55000, 1,1, 59, 1, 2),
	('2024-01-21 09:00', 180000, 0, 90000, 90000, 0,1, 60, 2, 1);
go
/*
	đây là những proc 

	mn chú ý 
*/
-- thong ke mon an

create proc Sp_ThongKeMonAn
as 
begin 
	select TenMonAn ,sum(ctgm.soluong) as Soluongmonan
	from MonAn ma
	join ChiTietGM ctgm on ctgm.MaMonAn = ma.MaMonAn
	group by TenMonAn
	order by Soluongmonan desc	
end 
go
-- thong ke doanh thu
CREATE  PROCEDURE [dbo].[SP_DoanhThuThang] (@thang int)
AS
BEGIN
    ;WITH AllDays AS (
        SELECT TOP (CASE 
                        WHEN @thang IN (1, 3, 5, 7, 8, 10, 12) THEN 31
                        WHEN @thang = 2 THEN 28
                        ELSE 30
                     END)
            DATEADD(DAY, ROW_NUMBER() OVER (ORDER BY (SELECT NULL)) - 1, CAST(CAST(YEAR(GETDATE()) AS VARCHAR) + '-' + CAST(@thang AS VARCHAR) + '-01' AS DATE)) AS NgayTrongThang
        FROM 
            sys.objects
    )
    SELECT 
        DAY(ad.NgayTrongThang) AS Thang,
        FORMAT(COALESCE(SUM(hd.TongTien), 0), '#,##0') AS TongThanhTien
    FROM 
        AllDays ad
    LEFT JOIN 
        HoaDon hd ON DAY(hd.NgayLap) = DAY(ad.NgayTrongThang) AND MONTH(hd.NgayLap) = @thang
    GROUP BY 
        DAY(ad.NgayTrongThang)
    ORDER BY 
        Thang;
END
go
-- thoe nam 
create PROCEDURE [dbo].[SP_DoanhThuNam] (@nam int)
AS
BEGIN
    SELECT 
        MONTH(hd.NgayLap) AS Thang,
        SUM(hd.TongTien) AS TongThanhTien
    FROM 
        HoaDon hd
    WHERE 
        YEAR(hd.NgayLap) = @nam
    GROUP BY 
        MONTH(hd.NgayLap);
END
go
 -- proc hoa don 
 create proc [dbo].[sp_ChiTietHD] @maHD varchar(10)
as
select TenMonAn,DonGia,ctgm.SoLuong,sum(DonGia*ctgm.SoLuong) as ThanhTien from HoaDon hd
join PhieuDatBan pdb on hd.MaPhieuDatBan = pdb.MaPhieuDatBan
join ChiTietGM ctgm on pdb.MaPhieuDatBan = ctgm.MaPhieuDatBan
join MonAn ma on ma.MaMonAn = ctgm.MaMonAn
where hd.MaHoaDon = @maHD
group by TenMonAn,DonGia,ctgm.SoLuong
 go 

 CREATE TRIGGER UpdateTongTien
ON HoaDon
AFTER INSERT, UPDATE
AS
BEGIN
    UPDATE HoaDon
    SET TongTien = (ISNULL(i.TienMonAn, 0) - ISNULL(i.TienGiamDiemThuong, 0) - ISNULL(i.TienGiamKhuyenMai, 0))
    FROM HoaDon hd
    INNER JOIN inserted i ON hd.MaHoaDon = i.MaHoaDon;
END;
go
CREATE TRIGGER Trig_UpdateVaiTro
ON NhanVien
AFTER UPDATE
AS
BEGIN
    IF UPDATE(ChucVu) -- Kiểm tra xem cột ChucVu đã được cập nhật
    BEGIN
        UPDATE TaiKhoan
        SET VaiTro = CASE
                        WHEN inserted.ChucVu = 1 THEN 1 -- Nếu ChucVu là 1 (ví dụ: quản lý), gán VaiTro là 1
                        ELSE 0 -- Ngược lại, gán VaiTro là 0
                     END
        FROM TaiKhoan
        INNER JOIN inserted ON TaiKhoan.MaNhanVien = inserted.MaNhanVien
    END
END;
go
CREATE OR ALTER TRIGGER Trig_UpdateSoLuongMonAn
ON ChiTietGM
AFTER INSERT, DELETE
AS
BEGIN
    IF EXISTS(SELECT * FROM inserted) 
    BEGIN
        
        UPDATE MonAn
        SET SoLuong = MonAn.SoLuong - (SELECT SUM(SoLuong) FROM inserted WHERE inserted.MaMonAn = MonAn.MaMonAn)
        WHERE MonAn.MaMonAn IN (SELECT MaMonAn FROM inserted);
    END

    IF EXISTS(SELECT * FROM deleted) 
    BEGIN
        
        UPDATE MonAn
        SET SoLuong = MonAn.SoLuong + (SELECT SUM(SoLuong) FROM deleted WHERE deleted.MaMonAn = MonAn.MaMonAn)
        WHERE MonAn.MaMonAn IN (SELECT MaMonAn FROM deleted);
    END
END;
go


CREATE or alter PROCEDURE SP_ReSetMaPhieuDatBan (@MaPhieuDatBan int)
AS
BEGIN
    DBCC CHECKIDENT ('PhieuDatBan', RESEED, @MaPhieuDatBan);
END
go


CREATE or alter PROCEDURE SP_ReSetMaKhachHang (@MaKhachHang int)
AS
BEGIN
    DBCC CHECKIDENT ('KhachHang', RESEED, @MaKhachHang);
END
go


-- thong ke danh gia 
create or alter proc Sp_soluongdanhgia
as 
begin
	SELECT top 5 COALESCE(COUNT(ctgm.MaDanhGia), 0) AS soluongdanhgia
FROM DanhGia ad
LEFT JOIN ChiTietGM ctgm ON ctgm.MaDanhGia = ad.MaDanhGia
GROUP BY ad.MaDanhGia
ORDER BY ad.MaDanhGia;
end
go
-- lay danh gia 

 create or alter proc sp_laySao
 as 
 begin
	 
	 select dg.MaDanhGia maDanhGia, COUNT(ctgm.madanhgia) soluongdanhgia
 from ChiTietGM ctgm
 inner join DanhGia dg on dg.MaDanhGia = ctgm.MaDanhGia
 group by dg.MaDanhGia

 end
 go
 -- proc chi tiet danh gia
 create proc sp_chitietDanhGia(@MaDanhGia int)
 as 
 begin
	 select TenMonAn,COUNT(ctgm.MaDanhGia) soluongdanhgia
	 from ChiTietGM ctgm 
	 inner join MonAn ma on ma.MaMonAn = ctgm.MaMonAn
	 inner join DanhGia dg on dg.MaDanhGia = ctgm.MaDanhGia
	 where dg.MaDanhGia = @MaDanhGia
	 group by TenMonAn
	 order by soluongdanhgia desc
 end 
 go


 CREATE OR ALTER TRIGGER Trig_UpdateTienMonAn
ON ChiTietGM
AFTER INSERT, DELETE
AS
BEGIN
    IF EXISTS(SELECT * FROM inserted) 
    BEGIN
        UPDATE HoaDon
        SET TienMonAn = (SELECT SUM(MonAn.DonGia * ChiTietGM.SoLuong) 
                         FROM ChiTietGM 
                         INNER JOIN MonAn ON ChiTietGM.MaMonAn = MonAn.MaMonAn 
                         WHERE ChiTietGM.MaPhieuDatBan = HoaDon.MaPhieuDatBan)
        WHERE HoaDon.MaPhieuDatBan IN (SELECT MaPhieuDatBan FROM inserted);
    END

    IF EXISTS(SELECT * FROM deleted) 
    BEGIN
        UPDATE HoaDon
        SET TienMonAn = (SELECT SUM(MonAn.DonGia * ChiTietGM.SoLuong) 
                         FROM ChiTietGM 
                         INNER JOIN MonAn ON ChiTietGM.MaMonAn = MonAn.MaMonAn 
                         WHERE ChiTietGM.MaPhieuDatBan = HoaDon.MaPhieuDatBan)
        WHERE HoaDon.MaPhieuDatBan IN (SELECT MaPhieuDatBan FROM deleted);
    END 
END;
go


 
 