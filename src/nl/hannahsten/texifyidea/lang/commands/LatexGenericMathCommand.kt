package nl.hannahsten.texifyidea.lang.commands

import nl.hannahsten.texifyidea.lang.LatexPackage
import nl.hannahsten.texifyidea.lang.LatexPackage.Companion.AMSMATH
import nl.hannahsten.texifyidea.lang.LatexPackage.Companion.AMSSYMB
import nl.hannahsten.texifyidea.lang.LatexPackage.Companion.WASYSYM

/**
 * @author Hannah Schellekens
 */
enum class LatexGenericMathCommand(
    override val command: String,
    override vararg val arguments: Argument = emptyArray(),
    override val dependency: LatexPackage = LatexPackage.DEFAULT,
    override val display: String? = null,
    override val isMathMode: Boolean = true,
    val collapse: Boolean = false
) : LatexCommand {

    ACUTE("acute", "a".asRequired()),
    ALEPH("aleph"),
    AMALGAMATION("amalg", display = "⨿", collapse = true),
    INVERSE_COSINE("arccos"),
    INVERSE_SINE("arcsin"),
    INVERSE_TANGENT("arctan"),
    ARGUMENT("arg"),
    ARROWVERT("arrowvert", display = "|", collapse = true),
    ASYMP("asymp", display = "≍", collapse = true),
    REVERSED_PRIME("backprime", dependency = AMSMATH, display = "‵", collapse = true),
    BACKSLASH("backslash", display = "\\", collapse = true),
    BAR("bar", "a".asRequired()),
    N_ARY_INTERSECTION("bigcap", display = "⋂", collapse = true),
    BIG_CIRCLE("bigcirc", display = "○", collapse = true),
    N_ARY_UNION("bigcup", display = "⋃", collapse = true),
    BIG_CIRCLED_DOT("bigodot", display = "⨀", collapse = true),
    BIG_CIRCLED_PLUS("bigoplus", display = "⨁", collapse = true),
    BIG_CIRCLED_TIMES("bigotimes", display = "⨂", collapse = true),
    N_ARY_SQUARE_UNION("bigsqcup", display = "⨆", collapse = true),
    BIGTRIANGLEDOWN("bigtriangledown", display = "▽", collapse = true),
    BIG_TRIANGLE_UP("bigtriangleup", display = "∆", collapse = true),
    BIG_TRIANGLE_DOWN("bigtrangledown", display = "▽", collapse = true),
    N_ARY_UNION_WITH_PLUS("biguplus", display = "⨄", collapse = true),
    BIG_VEE("bigvee", display = "⋁", collapse = true),
    BIG_WEDGE("bigwedge", display = "⋀", collapse = true),
    BIG_STAR("bigstar", dependency = AMSSYMB, display = "★", collapse = true),
    BINOM("binom", "total".asRequired(), "sample".asRequired(), dependency = AMSMATH),
    BLACKBOARD_BOLD_K("Bbbk", dependency = AMSSYMB, display = "\uD835\uDD5C", collapse = true),
    BLACK_SQUARE("blacksquare", dependency = AMSSYMB, display = "⬛", collapse = true),
    BLACK_LOZENGE("blacklozenge", dependency = AMSSYMB, display = "⧫", collapse = true),
    BLACK_TRIANGLE("blacktriangle", dependency = AMSSYMB, display = "▴", collapse = true),
    BLACK_TRIANGLE_DOWN("blacktriangledown", dependency = AMSSYMB, display = "▾", collapse = true),
    BM("bm", "text".asRequired(Argument.Type.TEXT), dependency = LatexPackage.BM),
    BMOD("bmod"),
    BOT("bot", display = "⟂", collapse = true),
    BRACEVERT("bracevert"),
    BREVE("breve", "a".asRequired()),
    CAPITAL_ARROWVERT("Arrowvert"),
    BOX("Box", dependency = AMSSYMB, display = "☐", collapse = true),
    AMSSYMB_DIAMOND("Diamond", dependency = AMSSYMB, display = "◇", collapse = true),
    MIRRORED_G("Game", dependency = AMSSYMB),
    PROBABILITY("Pr"),
    CDOT("cdot", display = "·", collapse = true),
    MIDDLE_DOT("cdotp", display = "·", collapse = true),
    CENTER_DOTS("cdots", display = "⋯", collapse = true),
    CHECK("check", "a".asRequired()),
    CIRCLED_R("circledR", dependency = AMSSYMB, display = "®", collapse = true),
    CIRCLED_S("circledS", dependency = AMSSYMB, display = "Ⓢ", collapse = true),
    CLOSING_BRACE("}", display = "}"),
    CLUB_SUIT("clubsuit", display = "♣", collapse = true),
    COLON("colon", display = ":", collapse = true),
    CONG("cong"),
    COSINE("cos"),
    HYPERBOLIC_COSINE("cosh"),
    COTANGENT("cot"),
    HYPERBOLIC_COTANGENT("coth"),
    COSECANT("csc"),
    DAGGER("dagger", display = "†", collapse = true),
    LEFT_TACK("dashv", display = "⊣", collapse = true),
    DOUBLE_DAGGER("ddagger", display = "‡", collapse = true),
    QUADRUPLE_DOTS("ddddot", "a".asRequired(), dependency = AMSMATH),
    TRIPLE_DOTS("dddot", "a".asRequired(), dependency = AMSMATH),
    DOUBLE_DOTS("ddot", "a".asRequired()),
    DOWN_RIGHT_DIAGONAL_DOTS("ddots", display = "⋱", collapse = true),
    DEGREES("deg"),
    DERMINANT("det"),
    DFRAC("dfrac", "num".asRequired(), "den".asRequired(), dependency = AMSMATH),
    DIAGONAL_DOWN("diagdown", dependency = AMSSYMB, display = "∖", collapse = true),
    DIAGONAL_UP("diagup", dependency = AMSSYMB, display = "∕", collapse = true),
    DIAMOND("diamond", display = "◇", collapse = true),
    DIAMOND_SUIT("diamondsuit", display = "♢", collapse = true),
    DIMENSION("dim"),
    DIV("div", display = "÷", collapse = true),
    DIVIDEONTIMES("divideontimes", dependency = AMSSYMB, display = "⋇", collapse = true),
    DOT("dot", "a".asRequired()),
    DOTEQ("doteq"),
    DOTS("dots", display = "⋯", collapse = true),
    DOUBLE_VERTICAL_ARROW("Arrowvert"),
    DOUBLE_VERTICAL_LINE("|", display = "‖", collapse = true),
    SCRIPT_SMALL_L("ell", display = "ℓ", collapse = true),
    ETH("eth", dependency = AMSSYMB, display = "ð", collapse = true),
    EXPONENTIAL("exp"),
    FLAT("flat", display = "♭", collapse = true),
    FRAC("frac", "num".asRequired(), "den".asRequired()),
    GREATEST_COMMON_DIVISOR("gcd"),
    GRAVE("grave", "a".asRequired()),
    HAT("hat", "a".asRequired()),
    H_BAR("hbar", display = "ℏ", collapse = true),
    HEART_SUIT("heartsuit", display = "♡", collapse = true),
    HOMOMORPHISM("hom"),
    H_SLASH("hslash", dependency = AMSSYMB, display = "ħ", collapse = true),
    IMAGINARY("Im", display = "ℑ", collapse = true),
    DOTLESS_I("imath", display = "ı", collapse = true),
    INFINUM("inf"),
    INTERTEXT("intertext", "text".asRequired(), dependency = AMSMATH),
    INVERSE_F("Finv", dependency = AMSSYMB, display = "Ⅎ", collapse = true),
    INVERSED_NOT_SIGN("invneg", dependency = WASYSYM),
    DOTLESS_J("jmath", display = "ȷ", collapse = true),
    KERNEL("ker"),
    LDOTP("ldotp"),
    LOWER_DOTS("ldots", display = "…", collapse = true),
    BASE_2_LOGARITHM("lg"),
    LIMIT("lim"),
    LIMIT_INFERIOR("liminf"),
    LIMIT_SUPERIOR("limsup"),
    NATURAL_LOGARITHM("ln"),
    LOGARITHM("log"),
    LOG_OF("logof", dependency = WASYSYM, display = "⍟", collapse = true),
    LOWER_LEFT_CORNER("llcorner", dependency = AMSSYMB, display = "⌞", collapse = true),
    LOWER_RIGHT_CORNER("lrcorner", dependency = AMSSYMB, display = "⌟", collapse = true),
    LOZENGE("lozenge", dependency = AMSSYMB, display = "⬨", collapse = true),
    MATHBB("mathbb", "text".asRequired(Argument.Type.TEXT), dependency = LatexPackage.AMSFONTS),
    MATHBF("mathbf", "text".asRequired()),
    MATHCAL("mathcal", "text".asRequired()),
    MATHDS("mathds", "mathds".asRequired()),
    MATHELLIPSIS("mathellipsis"),
    MATHFRAK("mathfrak", "text".asRequired(Argument.Type.TEXT), dependency = LatexPackage.AMSFONTS),
    MATHGROUP("mathgroup"),
    MATHIT("mathit", "text".asRequired()),
    MATHNORMAL("mathnormal", "text".asRequired()),
    MATHRING("mathring", "a".asRequired()),
    MATHRM("mathrm", "text".asRequired()),
    MATHSCR("mathscr"),
    MATHSF("mathsf", "text".asRequired()),
    MATHSTERLING("mathsterling"),
    MATHTT("mathtt", "text".asRequired()),
    MATHUNDERSCORE("mathunderscore"),
    MAXIMUM("max"),
    MINIMUM("min"),
    NATURAL("natural", display = "♮", collapse = true),
    NOT_SIGN("neg", display = "¬", collapse = true),
    O_CIRCLE("ocircle", dependency = WASYSYM, display = "◯", collapse = true),
    OPEN_BRACE("{", display = "{"),
    OVERBRACE("overbrace", "text".asRequired()),
    OVER_LEFT_ARROW("overleftarrow", "text".asRequired()),
    OVER_LEFT_RIGHT_ARROW("overleftrightarrow", "text".asRequired(), dependency = AMSMATH),
    OVERLINE("overline", "text".asRequired()),
    OVER_RIGHT_ARROW("overrightarrow", "text".asRequired()),
    PMOD("pmod"),
    PRIME("prime", display = "′", collapse = true),
    INVERSE_LIMIT("projlim", dependency = AMSMATH),
    REAL("Re", display = "ℜ", collapse = true),
    REVERSED_OHM("mho", dependency = AMSSYMB, display = "℧", collapse = true),
    SECANT("sec"),
    SHARP("sharp", display = "♯", collapse = true),
    SINE("sin"),
    HYPERBOLIC_SINE("sinh"),
    SPADE_SUIT("spadesuit", display = "♠", collapse = true),
    SQUARE_ROOT("sqrt", "root".asOptional(), "arg".asRequired()),
    SQUARE("square", dependency = AMSSYMB, display = "◻", collapse = true),
    STACKED_RELATION("stackrel", "top".asRequired(), "relation".asRequired()),
    SUPREMUM("sup"),
    SQUARE_ROOT_SURD("surd", display = "√", collapse = true),
    TANGENT("tan"),
    HBOLICTANGENT("tanh"),
    TEXT("text", "text".asRequired(), dependency = AMSMATH),
    TILDE("tilde", "a".asRequired()),
    TOP("top", display = "⊤", collapse = true),
    TRIANGLE_UP("triangle", display = "△", collapse = true),
    TRIANGLE_DOWN("triangledown", dependency = AMSSYMB, display = "▽", collapse = true),
    UNDERBRACE("underbrace", "text".asRequired()),
    UNDER_LEFT_ARROW("underleftarrow", "text".asRequired(), dependency = AMSMATH),
    UNDER_LEFT_RIGHT_ARROW("underleftrightarrow", "text".asRequired(), dependency = AMSMATH),
    UNDERLINE("underline", "text".asRequired()),
    UNDER_RIGHT_ARROW("underrightarrow", "text".asRequired(), dependency = AMSMATH),
    UNDERSCORE("_", display = "_"),
    UPPER_LEFT_CORNER("ulcorner", dependency = AMSSYMB, display = "⌜", collapse = true),
    UPPER_RIGHT_CORNER("urcorner", dependency = AMSSYMB, display = "⌝", collapse = true),
    DIRECT_LIMIT_VARIANT("varinjlim", dependency = AMSMATH),
    LIMIT_INFERIOR_VARIANT("varliminf", dependency = AMSMATH),
    LIMIT_SUPERIOR_VARIANT("varlimsup", dependency = AMSMATH),
    INVERSE_LIMIT_VARIANT("varprojlim", dependency = AMSMATH),
    TRIANGLE_VARIANT("vartriangle", dependency = AMSSYMB, display = "△", collapse = true),
    VERTICAL_DOTS("vdots", display = "⋮", collapse = true),
    VECTOR("vec", "a".asRequired()),
    VEE("vee", display = "⋁", collapse = true),
    VERTICAL_ARROW("arrowvert"),
    WASYSYM_PROPTO("wasypropto", dependency = WASYSYM, display = "∝", collapse = true),
    WEDGE("wedge", display = "⋀", collapse = true),
    WIDE_HAT("widehat", "text".asRequired()),
    WIDE_TILDE("widetilde", "text".asRequired()),
    SCRIPT_CAPITAL_P("wp", display = "℘", collapse = true),
    ABOVE_LEFT_ARROW("xleftarrow", "text".asRequired(), dependency = AMSMATH),
    ABOVE_RIGHT_ARROW("xrightarrow", "text".asRequired(), dependency = AMSMATH),
    ;

    override val identifier: String
        get() = name
}