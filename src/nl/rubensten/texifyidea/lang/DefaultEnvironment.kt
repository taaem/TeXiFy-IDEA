package nl.rubensten.texifyidea.lang

import nl.rubensten.texifyidea.lang.Environment.Context
import nl.rubensten.texifyidea.psi.LatexEnvironment
import nl.rubensten.texifyidea.util.name
import java.util.*

/**
 * @author Ruben Schellekens, Sten Wessel
 */
enum class DefaultEnvironment(
        vararg override val arguments: Argument,
        override val environmentName: String,
        override val initialContents: String = "",
        override val context: Context = Context.NORMAL,
        val `package`: Package = Package.DEFAULT
) : Environment {

    // Vanilla LaTeX
    ABSTRACT(environmentName = "abstract"),
    ALLTT(environmentName = "alltt"),
    CENTER(environmentName = "center"),
    DESCRIPTION(environmentName = "description", initialContents = "\\item "),
    DISPLAYMATH(environmentName = "displaymath"),
    DOCUMENT(environmentName = "document"),
    ENUMERATE(environmentName = "enumerate", initialContents = "\\item "),
    EQUATION(environmentName = "equation", context = Context.MATH),
    EQUATION_STAR(environmentName = "equation*", context = Context.MATH),
    EQNARRAY(environmentName = "eqnarray"),
    FIGURE(environmentName = "figure", arguments = OptionalArgument("placement")),
    FIGURE_STAR(environmentName = "figure*", arguments = OptionalArgument("placement")),
    FILECONTENTS(environmentName = "filecontents"),
    FILECONTENTS_STAR(environmentName = "filecontents*"),
    FLUSHLEFT(environmentName = "flushleft"),
    FLUSHRIGHT(environmentName = "flushright"),
    FOOTNOTESIZE(environmentName = "footnotesize"),
    HUGE(environmentName = "huge"),
    CAPITAL_HUGE(environmentName = "Huge"),
    ITEMIZE(environmentName = "itemize", initialContents = "\\item "),
    LARGE(environmentName = "large"),
    CAPITAL_LARGE(environmentName = "Large"),
    SCREAMING_LARGE(environmentName = "LARGE"),
    LIST(RequiredArgument("label"), RequiredArgument("spacing"), environmentName = "list"),
    LRBOX(environmentName = "lrbox"),
    MATH(environmentName = "math"),
    MINIPAGE(OptionalArgument("position"), RequiredArgument("width"), environmentName = "minipage"),
    NORMALSIZE(environmentName = "normalsize"),
    QUOTATION(environmentName = "quotation"),
    QUOTE(environmentName = "quote"),
    SCRIPTSIZE(environmentName = "scriptsize"),
    SMALL(environmentName = "small"),
    TABBING(environmentName = "tabbing"),
    TABLE(environmentName = "table", arguments = OptionalArgument("placement")),
    TABLE_STAR(environmentName = "table*", arguments = OptionalArgument("placement")),
    TABULAR(OptionalArgument("pos"), RequiredArgument("cols"), environmentName = "tabular"),
    TABULAR_STAR(RequiredArgument("width"), OptionalArgument("pos"), RequiredArgument("cols"), environmentName = "tabular*"),
    THEBIBLIOGRAPHY(environmentName = "thebibliography", arguments = RequiredArgument("widestlabel")),
    THEINDEX(environmentName = "theindex"),
    THEOREM(environmentName = "theorem", arguments = OptionalArgument("optional")),
    TINY(environmentName = "tiny"),
    TITLEPAGE(environmentName = "titlepage"),
    TRIVLIST(environmentName = "trivlist"),
    VERBATIM(environmentName = "verbatim"),
    VERBATIM_STAR(environmentName = "verbatim*"),
    VERSE(environmentName = "verse"),

    // amsmath
    ALIGN(environmentName = "align", context = Context.MATH, `package` = Package.AMSMATH),
    ALIGN_STAR(environmentName = "align*", context = Context.MATH, `package` = Package.AMSMATH),
    ALIGNAT(environmentName = "alignat", context = Context.MATH, `package` = Package.AMSMATH),
    ALIGNAT_STAR(environmentName = "alignat*", context = Context.MATH, `package` = Package.AMSMATH),
    FLALIGN(environmentName = "flalign", context = Context.MATH, `package` = Package.AMSMATH),
    FLALIGN_STAR(environmentName = "flalign*", context = Context.MATH, `package` = Package.AMSMATH),
    GATHER(environmentName = "gather", context = Context.MATH, `package` = Package.AMSMATH),
    GATHER_STAR(environmentName = "gather*", context = Context.MATH, `package` = Package.AMSMATH),
    MULTLINE(environmentName = "multline", context = Context.MATH, `package` = Package.AMSMATH),
    MULTLINE_STAR(environmentName = "multline*", context = Context.MATH, `package` = Package.AMSMATH),
    SPLIT(environmentName = "split", context = Context.MATH, `package` = Package.AMSMATH),
    SPLIT_STAR(environmentName = "split*", context = Context.MATH, `package` = Package.AMSMATH),
    CASES(environmentName = "cases", context = Context.MATH, `package` = Package.AMSMATH),

    // comment
    COMMENT(environmentName = "comment", context = Context.COMMENT, `package` = Package.COMMENT);

    companion object {

        /**
         * Caches all the enum instances to increase performance.
         */
        private val lookup = HashMap<String, DefaultEnvironment>()

        init {
            for (environment in DefaultEnvironment.values()) {
                lookup.put(environment.environmentName, environment)
            }
        }

        /**
         * Gets the [DefaultEnvironment] object that corresponds to the given Psi environment.
         */
        @JvmStatic
        fun fromPsi(latexEnvironment: LatexEnvironment): DefaultEnvironment? {
            val text: String = latexEnvironment.name()?.text ?: return null
            return get(text)
        }

        /**
         * Finds the [DefaultEnvironment] object with the given name.
         */
        @JvmStatic
        operator fun get(name: String): DefaultEnvironment? = lookup[name]
    }

    override fun getDependency(): Package = `package`
}
