package org.jetbrains.plugins.clojure.lexer;

import com.intellij.psi.tree.TokenSet;

/**
 * @author ilyas
 */
public class TokenSets implements ClojureTokenTypes {

  public static final TokenSet REFERENCE_NAMES = TokenSet.create(symATOM);

  public static final TokenSet DOTS = TokenSet.create(symDOT, symNS_SEP);
}
