// This is a generated file. Not intended for manual editing.
package kn.uni.dbis.oberon.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static kn.uni.dbis.oberon.lang.psi.OberonTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import kn.uni.dbis.oberon.lang.psi.*;

public class OberonAssignmentImpl extends ASTWrapperPsiElement implements OberonAssignment {

  public OberonAssignmentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OberonVisitor visitor) {
    visitor.visitAssignment(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OberonVisitor) accept((OberonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public OberonExpression getExpression() {
    return findNotNullChildByClass(OberonExpression.class);
  }

  @Override
  @NotNull
  public OberonIdent getIdent() {
    return findNotNullChildByClass(OberonIdent.class);
  }

  @Override
  @NotNull
  public List<OberonSelector> getSelectorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OberonSelector.class);
  }

}
