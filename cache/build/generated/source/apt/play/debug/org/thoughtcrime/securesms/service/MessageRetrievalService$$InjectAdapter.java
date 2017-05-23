// Code generated by dagger-compiler.  Do not edit.
package org.thoughtcrime.securesms.service;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<MessageRetrievalService>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code MessageRetrievalService} and its
 * dependencies.
 *
 * Being a {@code Provider<MessageRetrievalService>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<MessageRetrievalService>} and handling injection
 * of annotated fields.
 */
public final class MessageRetrievalService$$InjectAdapter extends Binding<MessageRetrievalService>
    implements Provider<MessageRetrievalService>, MembersInjector<MessageRetrievalService> {
  private Binding<org.whispersystems.signalservice.api.SignalServiceMessageReceiver> receiver;

  public MessageRetrievalService$$InjectAdapter() {
    super("org.thoughtcrime.securesms.service.MessageRetrievalService", "members/org.thoughtcrime.securesms.service.MessageRetrievalService", NOT_SINGLETON, MessageRetrievalService.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    receiver = (Binding<org.whispersystems.signalservice.api.SignalServiceMessageReceiver>) linker.requestBinding("org.whispersystems.signalservice.api.SignalServiceMessageReceiver", MessageRetrievalService.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(receiver);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<MessageRetrievalService>}.
   */
  @Override
  public MessageRetrievalService get() {
    MessageRetrievalService result = new MessageRetrievalService();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<MessageRetrievalService>}.
   */
  @Override
  public void injectMembers(MessageRetrievalService object) {
    object.receiver = receiver.get();
  }

}