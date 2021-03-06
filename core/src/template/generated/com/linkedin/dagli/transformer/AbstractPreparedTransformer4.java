// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the transformer/AbstractPreparedTransformerX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.transformer;

import com.linkedin.dagli.producer.Producer;
import com.linkedin.dagli.transformer.internal.PreparedTransformer4InternalAPI;


/**
 * Base class for prepared transformers of arity 4 that do not cache temporary data during execution and do not
 * minibatch their inputs (transformers that do so should instead derive from
 * {@link AbstractPreparedStatefulTransformer4}.)
 *
 * @param <A> the type of the first input to the transformer
 * @param <B> the type of the second input to the transformer
 * @param <C> the type of the third input to the transformer
 * @param <D> the type of the fourth input to the transformer
 * @param <R> the type of result produced by the transformer
 * @param <S> the ultimate derived class
 */
public abstract class AbstractPreparedTransformer4<A, B, C, D, R, S extends AbstractPreparedTransformer4<A, B, C, D, R, S>>
    extends AbstractTransformer4<A, B, C, D, R, PreparedTransformer4InternalAPI<A, B, C, D, R, S>, S> implements
    PreparedTransformer4<A, B, C, D, R> {

  private static final long serialVersionUID = 1;

  public AbstractPreparedTransformer4() {
    super();
  }

  @Override
  public PreparedTransformer4InternalAPI<A, B, C, D, R, S> internalAPI() {
    return (PreparedTransformer4InternalAPI<A, B, C, D, R, S>) super.internalAPI();
  }

  @Override
  protected PreparedTransformer4InternalAPI<A, B, C, D, R, S> createInternalAPI() {
    return new InternalAPI();
  }

  protected class InternalAPI extends
      AbstractTransformer4<A, B, C, D, R, PreparedTransformer4InternalAPI<A, B, C, D, R, S>, S>.InternalAPI implements
      PreparedTransformer4InternalAPI<A, B, C, D, R, S> {
    @Override
    public R apply(Object executionCache, A value1, B value2, C value3, D value4) {
      return AbstractPreparedTransformer4.this.apply(value1, value2, value3, value4);
    }
  }

  public AbstractPreparedTransformer4(Producer<? extends A> input1, Producer<? extends B> input2,
      Producer<? extends C> input3, Producer<? extends D> input4) {
    super(input1, input2, input3, input4);
  }
}
