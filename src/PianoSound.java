public enum PianoSound {

    a(1, "E:\\piano\\021.wav", "a"),
    b(2, "E:\\piano\\022.wav", "b"),
    c(3, "E:\\piano\\023.wav", "c"),
    d(4, "E:\\piano\\024.wav", "d"),
    e(5, "E:\\piano\\025.wav", "e"),
    f(6, "E:\\piano\\026.wav", "f"),
    g(7, "E:\\piano\\027.wav", "g"),
    h(8, "E:\\piano\\028.wav", "h"),
    i(9, "E:\\piano\\029.wav", "i"),
    j(10, "E:\\piano\\030.wav", "j"),
    k(11, "E:\\piano\\031.wav", "k"),
    l(12, "E:\\piano\\032.wav", "l"),
    m(13, "E:\\piano\\033.wav", "m"),
    n(14, "E:\\piano\\034.wav", "n"),
    o(15, "E:\\piano\\035.wav", "o"),
    p(16, "E:\\piano\\036.wav", "p"),
    q(17, "E:\\piano\\037.wav", "q"),
    r(18, "E:\\piano\\038.wav", "r"),
    s(19, "E:\\piano\\039.wav", "s"),
    t(20, "E:\\piano\\040.wav", "t"),
    u(21, "E:\\piano\\041.wav", "u"),
    v(22, "E:\\piano\\042.wav", "v"),
    w(23, "E:\\piano\\043.wav", "w"),
    x(24, "E:\\piano\\044.wav", "x"),
    y(25, "E:\\piano\\045.wav", "y"),
    z(26, "E:\\piano\\046.wav", "z"),
    one(26, "E:\\piano\\047.wav", "1"),
    bb(26, "E:\\piano\\048.wav", "2"),
    cc(26, "E:\\piano\\049.wav", "3"),
    dd(26, "E:\\piano\\050.wav", "4"),
    ee(26, "E:\\piano\\051.wav", "5"),
    ff(26, "E:\\piano\\052.wav", "6"),
    gg(26, "E:\\piano\\053.wav", "7"),
    hh(26, "E:\\piano\\054.wav", "8"),
    ii(26, "E:\\piano\\054.wav", "0"),
    jj(26, "E:\\piano\\056.wav", "9"),
    A(1, "E:\\piano\\057.wav", "A"),
    B(2, "E:\\piano\\058.wav", "B"),
    C(3, "E:\\piano\\059.wav", "C"),
    D(4, "E:\\piano\\060.wav", "D"),
    E(5, "E:\\piano\\061.wav", "E"),
    F(6, "E:\\piano\\062.wav", "F"),
    G(7, "E:\\piano\\063.wav", "G"),
    H(8, "E:\\piano\\064.wav", "H"),
    I(9, "E:\\piano\\065.wav", "I"),
    J(10, "E:\\piano\\066.wav", "J"),
    K(11, "E:\\piano\\067.wav", "K"),
    L(12, "E:\\piano\\068.wav", "L"),
    M(13, "E:\\piano\\069.wav", "M"),
    N(14, "E:\\piano\\070.wav", "N"),
    O(15, "E:\\piano\\071.wav", "O"),
    P(16, "E:\\piano\\072.wav", "P"),
    Q(17, "E:\\piano\\073.wav", "Q"),
    R(18, "E:\\piano\\074.wav", "R"),
    S(19, "E:\\piano\\075.wav", "S"),
    T(20, "E:\\piano\\076.wav", "T"),
    U(21, "E:\\piano\\077.wav", "U"),
    V(22, "E:\\piano\\078.wav", "V"),
    W(23, "E:\\piano\\079.wav", "W"),
    X(24, "E:\\piano\\080.wav", "X"),
    Y(25, "E:\\piano\\081.wav", "Y"),
    Z(26, "E:\\piano\\082.wav", "Z");


    private int no;
    private String url;
    private String key;

    PianoSound(int no, String url, String key) {
        this.no = no;
        this.url = url;
        this.key = key;
    }

    public static String getUrlAddr(String no) {
        PianoSound[] values = PianoSound.values();
        for (PianoSound value : values) {
            if (value.key.equals(no)) {
                return value.url;
            }
        }
        return "";
    }

    public int getNo() {
        return no;
    }

    public String getUrl() {
        return url;
    }

    public String getKey() {
        return key;
    }
}
